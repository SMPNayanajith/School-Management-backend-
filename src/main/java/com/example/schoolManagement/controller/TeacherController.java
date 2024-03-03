package com.example.schoolManagement.controller;

import com.example.schoolManagement.DTO.StudentDTO;
import com.example.schoolManagement.DTO.TeacherDTO;
import com.example.schoolManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @GetMapping("get")
    public List<TeacherDTO> getTeacher() {
        return teacherService.getAllTeacher();
    }
    @PostMapping("post")
    public TeacherDTO saveTeacher(@RequestBody TeacherDTO teacherDTO){
       return teacherService.saveTeacher(teacherDTO);
    }

    @PutMapping("put")
    public TeacherDTO updateTeacher(TeacherDTO teacherDTO){
        return teacherService.updateTeacher(teacherDTO);
    }
    @DeleteMapping("delete")
    public String deleteUser(){
        return "success delete";
    }
}
