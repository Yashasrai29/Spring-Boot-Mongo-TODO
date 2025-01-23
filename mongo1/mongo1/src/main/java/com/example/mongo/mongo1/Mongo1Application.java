package com.example.mongo.mongo1;

import com.example.mongo.mongo1.model.Todo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoAuditing
public class Mongo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mongo1Application.class, args);
	}


}

