package com.ideaco.diacrudv1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "tab_aufa")

// untuk koneksi, lihat application.properties

public class UserModel {
    // untuk primary key, dan definisikan kolom di database nya disini
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // sesuaikan nama kolom di table
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_phone")
    private String userPhone;
    @Column(name = "user_address")
    private String userAddress;
    @Column(name = "user_resume")
    private String userResume;

    public String getPassword() {
        return userPassword;
    }
}
