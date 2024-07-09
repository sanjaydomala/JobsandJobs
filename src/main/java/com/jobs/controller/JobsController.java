package com.jobs.controller;

import com.jobs.Data.JobsData;
import com.jobs.Data.PaymentsV1;
import com.jobs.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    @Autowired
    JobsService jobsService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getalljobs")
    public List<JobsData> getaAllJobs(){
        return jobsService.getAllJobs();
    }

    @GetMapping("/{id}")
    public JobsData getJob(@PathVariable String id){
        return jobsService.getJob(id);
    }

    @PostMapping("/add-job")
    @ResponseStatus(HttpStatus.CREATED)
    public JobsData addJobs(@RequestBody @Validated JobsData jobsData){
        return jobsService.addJobs(jobsData);
    }

    @PutMapping("/updatejob")
    public JobsData updateJob(@RequestBody @Validated JobsData jobsData){
        return jobsService.updateJob(jobsData);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable String id){
        jobsService.deleteJob(id);
        return "deleted successfully";
    }

    @GetMapping("/category/{category}")
    public List<JobsData> getJobsByCategory(@PathVariable String category){
        return jobsService.getJobsByCategory(category);
    }

    @GetMapping("/payments")
    public String getPayments(){

        String url = "http://localhost:8082/payments/get-payments";
        return  restTemplate.getForObject(url,String.class);

    }
}
