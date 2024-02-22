package com.example.schoolManagement.controller;
import com.example.schoolManagement.Repo.StudentRepo;
import com.example.schoolManagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

public class StudentController {
    @Autowired
    private StudentRepo StudentRepo;

    @PostMapping("/student")
    Student newStudent (@RequestBody Student newStudent){
        return StudentRepo.save(newStudent);
    }
    @GetMapping("/students")
    List <Student> getAllStudent(){
        return StudentRepo.findAll();
    }

}
