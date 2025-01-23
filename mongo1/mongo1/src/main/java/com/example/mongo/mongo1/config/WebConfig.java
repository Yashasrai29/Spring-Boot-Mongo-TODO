package com.example.mongo.mongo1.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan("com.example.mongo.mongo1.*")
@EnableMongoRepositories(basePackages = {"com.example.mongo.mongo1.*"})
public class WebConfig  implements WebMvcConfigurer {


}



