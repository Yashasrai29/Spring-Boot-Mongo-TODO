package com.example.mongo.mongo1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "EmpTable")
public class Todo {
    @Id
    private Integer id;
    private String name;
    private String status;
    private Date duedate;
}
