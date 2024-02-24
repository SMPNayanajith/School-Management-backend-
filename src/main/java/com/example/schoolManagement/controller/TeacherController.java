package com.example.schoolManagement.controller;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/teacher")
@CrossOrigin
public class TeacherController {
    @GetMapping("get")
    public String getUser(){
        return "success";
    }
    @PostMapping("post")
    public String postUser(){
        return "success post";
    }
    @PutMapping("put")
    public String putUser(){
        return "success put";
    }
    @DeleteMapping("delete")
    public String deleteUser(){
        return "success delete";
    }
}
