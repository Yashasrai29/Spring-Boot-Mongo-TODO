package com.example.mongo.mongo1.repo;

import com.example.mongo.mongo1.Mongo1Application;
import com.example.mongo.mongo1.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends MongoRepository<Todo,Integer> {
}
