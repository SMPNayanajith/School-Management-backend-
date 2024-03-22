package com.example.schoolManagement.controller;
import com.example.schoolManagement.DTO.StudentDTO;
import com.example.schoolManagement.DTO.TeacherDTO;
import com.example.schoolManagement.Repo.StudentRepo;
import com.example.schoolManagement.entity.Student;
import com.example.schoolManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin("http://localhost:3000")

public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("get")
    public List<StudentDTO> getStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("post")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping("put")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO){

        return studentService.updateStudent(studentDTO);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }


}
