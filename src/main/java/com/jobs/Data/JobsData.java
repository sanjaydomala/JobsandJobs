package com.jobs.Data;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "JobsData")
@NoArgsConstructor
@AllArgsConstructor
public class JobsData {

    @JsonIgnore
    @Id
    private String id;
    private String title;
    private String description;
    private String companyName;
    private String location;
    private String employmentType; // Full-time, Part-time, Contract, etc.
    private Double estimatedCost;
    private Date startDate;
    private Date endDate;
    private boolean urgent;
    private int estimatedDurationInMonths;
    private double budget;
    private String priority;
    private Date datePosted;
    private List<String> requirements;
    private int experienceRequiredInYears;


}
