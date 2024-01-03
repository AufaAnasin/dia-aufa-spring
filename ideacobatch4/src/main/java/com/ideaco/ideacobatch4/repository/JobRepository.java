package com.ideaco.ideacobatch4.repository;

import com.ideaco.ideacobatch4.model.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface JobRepository extends JpaRepository<JobModel, Integer> {
    @Query(value = "SELECT * from tab_job", nativeQuery = true)
    List<JobModel> findByDataJob();

    @Query(value = "SELECT j FROM JobModel j WHERE j.jobId = :jobId")
    Optional<JobModel> findByJPQLJob(int jobId);
}
