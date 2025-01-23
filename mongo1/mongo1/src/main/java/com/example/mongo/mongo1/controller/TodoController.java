package com.example.mongo.mongo1.controller;

import com.example.mongo.mongo1.model.Todo;
import com.example.mongo.mongo1.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;





    @PostMapping
    public Todo save(@RequestBody Todo todo){
        return this.todoRepo.save(todo);
    }

    @GetMapping
    public List<Todo> getAll(Todo todo){
        return todoRepo.findAll();
    }

}
