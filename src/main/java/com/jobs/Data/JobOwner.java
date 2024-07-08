package com.jobs.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "JobOwner")
public class JobOwner {

    @Id
    private String OwnerId;
    private String OwnerName;
    private String OwnerContact;
    private String OwnerEmail;
    private String address;
    private List<JobsData> OwnerJobs;

}
