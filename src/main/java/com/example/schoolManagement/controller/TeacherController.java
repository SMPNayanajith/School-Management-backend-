package com.example.schoolManagement.controller;

import com.example.schoolManagement.Repo.TeacherRepo;
import com.example.schoolManagement.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TeacherController {

    @Autowired
    private TeacherRepo TeacherRepo;

    @PostMapping("/teacher")
    Teacher newTeacher (@RequestBody Teacher newTeacher){
        return TeacherRepo.save(newTeacher);
    }

    @GetMapping("/teachers")
    List <Teacher> getAllTeacher(){
        return TeacherRepo.findAll();
    }



}
