package com.ideaco.ideacobatch4.model;

import jakarta.persistence.*;

@Entity
// sesuaikan dengan di database
@Table(name = "tab_job")
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int jobId;

    @Column(name="job_name")
    private String jobName;

    @Column(name = "job_desc")
    private String job_desc;

    @Column(name="job_salary")
    private int jobSalary;
}
