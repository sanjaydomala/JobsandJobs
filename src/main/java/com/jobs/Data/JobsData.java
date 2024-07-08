package com.jobs.Data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Data
@Document(collection = "JobsData")
@NoArgsConstructor
@AllArgsConstructor
public class JobsData {
    @Id
    private String id;
    private String jobName;
    private String jobDescription;
    private String category;
    private String city;
    private Long pincode;
    private Long workforce;
    private Long days;


}
