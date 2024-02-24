package com.example.schoolManagement.controller;

import com.example.schoolManagement.DTO.TeacherDTO;
import com.example.schoolManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @GetMapping("get")
    public String getUser(){
        return "success";
    }

    @PostMapping("post")
    public TeacherDTO saveTeacher(@RequestBody TeacherDTO teacherDTO){
       return teacherService.saveTeacher(teacherDTO);
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
