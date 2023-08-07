import axios from 'axios'
import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './index.css'

function AddCar() {


  const [name, setName] = useState("")
  const [price, setPrice] = useState("")
  const [category, setCategory] = useState("")
  const [photo, setPhoto] = useState(null)
  const navigate = useNavigate();

  const handleChangeName = (e) => {
    setName(e.target.value);
  }

  const handleChangePrice= (e) => {
    setPrice(e.target.value);
  }

  const handleChangeCategory= (e) => {
    setCategory(e.target.value);
  }

  const handleChangePhoto= (e) => {
    setPhoto(e.target.files[0]);
  }


  const handleSubmit = (e) => {
    e.preventDefault()

    const formData = new FormData();
    formData.append('name', name)
    formData.append('price', parseInt(price))
    formData.append('category', category)
    // the api requesting for status, but we set to false, because we post the car that not been rented yet
    formData.append('status', false)
    formData.append('image', photo)

    const config = {
      headers: {
          'Content-Type': 'application/x-www-form-urlencoded',
          'access_token': localStorage.getItem('admin_token')
      }
    }

    // karena kita ngeadd data, jadi kita menggunakan method post dari axios
    const api = "https://api-car-rental.binaracademy.org/admin/car"
    axios.post(api, formData, config
    ).then((res) => console.log(res)).catch((err) => console.log(err));
      setTimeout(() => {
        navigate('/dashboard')
      }, 2000);
  }


  return (
    <div className="container">
        <div className="row">
            <p className='page-direct'><strong>Cars &gt; List Cars &gt; </strong> Add New Car</p>
            <h1>Add New Car</h1>
        </div>
        <div className="row">
            <form>
                <div className="col form">
                    <p>Nama/Type Mobil</p>
                    <input type="text" className="form-control add" value={name} onChange={handleChangeName} id="formGroupExampleInput" placeholder="Input Nama/Type Mobil" style={{marginBottom: "10px"}} />
                </div>
                <div className="col form">
                    <p>Harga</p>
                    <input type="text" className="form-control add" value={price} onChange={handleChangePrice} id="formGroupExampleInput" placeholder="Input Harga Sewa Mobil" style={{marginBottom: "10px"}} />
                </div>
                <div className="col form">
                    <p>Foto</p>
                    <input type="file" className="form-control add" onChange={handleChangePhoto} aria-label="file example" style={{marginBottom: "10px"}} required />
                </div>
                <div className="col form">
                    <p>Kategori</p>
                    <select className="form-control add" id="validationServer04" onChange={handleChangeCategory} aria-describedby="validationServer04Feedback" style={{marginBottom: "10px"}}  required>
                        <option selected disabled value="">Choose...</option>
                        <option value='small'>Small</option>
                        <option value='medium'>Medium</option>
                        <option value='large'>Large</option>
                    </select>
                </div>
                <div className="col form">
                    <p>Created At</p>
                    <p>-</p>
                </div>
                <div className="col form">
                    <p>Updated At</p>
                    <p>-</p>
                </div>
                <div className="button-groups">
                    <button type="submit" onClick={() => navigate('/dashboard')} className="btn btn-outline-primary" style={{marginRight: "16px"}}>Cancel</button>
                    <button type="submit" onClick={handleSubmit} className="btn btn-primary">Add Car</button>
                </div>
            </form>
        </div>
    </div>
  )
}

export default AddCar