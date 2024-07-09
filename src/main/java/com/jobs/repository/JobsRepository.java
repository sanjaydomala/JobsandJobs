package com.jobs.repository;

import com.jobs.Data.JobsData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface JobsRepository extends MongoRepository<JobsData,String> {

    @Query("{'category' : ?0}")
    List<JobsData> findByCategory(String category);
}
