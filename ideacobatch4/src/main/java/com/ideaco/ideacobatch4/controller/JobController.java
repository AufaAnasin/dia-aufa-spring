package com.ideaco.ideacobatch4.controller;

import com.ideaco.ideacobatch4.model.JobModel;
import com.ideaco.ideacobatch4.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/job")
public class JobController {

    // hubungkan controller ke service
    private JobService jobService;
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/data")
    public String getData(){
//        return jobService.getData(1);
        return "Hello World";
    }

    @GetMapping("/dataWithPathVariable/{jobId}")
    public String getDataWithPathVariable(@PathVariable("jobId") int jobId) {
        return "Value : " + jobId;
    }

    @GetMapping("/dataWithParams")
    public List<JobModel> getDataWithParams(@RequestParam("jobId") int jobId) {
        //cara pake params
        return jobService.getData(jobId);
    }

    @GetMapping("/dataJpql")
    public Optional<JobModel> getDataJpql(@RequestParam("jobId") int jobId) {
        return jobService.getDataOptional(jobId);
    }
}
