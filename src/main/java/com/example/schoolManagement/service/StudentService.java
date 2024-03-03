package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.DTO.StudentDTO;
import com.example.schoolManagement.Repo.StudentRepo;
import com.example.schoolManagement.entity.Staff;
import com.example.schoolManagement.entity.Student;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO saveStudent(StudentDTO studentDTO){

        studentRepo.save(modelMapper.map(studentDTO, Student.class));
                return studentDTO;

    }

    public List<StudentDTO> getAllStudent(){
        List<Student>studentList=studentRepo.findAll();
        return modelMapper.map(studentList,new TypeToken<List<StudentDTO>>(){}.getType());
    }

    public StudentDTO updateStudent(StudentDTO studentDTO){

        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;

    }
}
