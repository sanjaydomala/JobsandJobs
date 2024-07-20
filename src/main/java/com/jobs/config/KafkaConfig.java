package com.jobs.config;

import com.jobs.Data.JobsData;
import com.jobs.util.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@EnableKafka
public class KafkaConfig {

    @Bean
    public NewTopic publishJob(){
        return TopicBuilder.name(AppConstants.POSTJOB).build();
    }



}

