package com.jobs.service;

import com.jobs.Data.JobsData;
import com.jobs.repository.JobsRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class JobsService {

    public static final Logger logger = LoggerFactory.getLogger(JobsService.class);
    @Autowired
    JobsRepository jobsRepository;

    public JobsData addJobs(JobsData job) {
        job.setId(UUID.randomUUID().toString());
        logger.info("job id is :{}",UUID.randomUUID().toString());
        return jobsRepository.save(job);
    }

    public List<JobsData> getAllJobs() {
        return jobsRepository.findAll();
    }

    public List<JobsData> getCategoryJobs(String category) {
        return jobsRepository.findByCategory(category);
    }

    public JobsData updateJob(JobsData updatedJob) {
        JobsData existingJob = jobsRepository.findById(updatedJob.getId()).get();

        existingJob.setJobName(updatedJob.getJobName());
        existingJob.setJobDescription(updatedJob.getJobDescription());
        existingJob.setCategory(updatedJob.getCategory());
        return existingJob;
    }

    public void deleteJob(String id) {
        JobsData job = jobsRepository.findById(id).get();
        jobsRepository.delete(job);
    }

    public JobsData getJob(String id) {
        return jobsRepository.findById(id).get();
    }

    public List<JobsData> getJobsByCategory(String category){
        return jobsRepository.findByCategory(category);
    }
}
