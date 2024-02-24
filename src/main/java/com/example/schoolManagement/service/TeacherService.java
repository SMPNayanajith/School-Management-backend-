package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.TeacherDTO;
import com.example.schoolManagement.Repo.TeacherRepo;
import com.example.schoolManagement.entity.Teacher;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private ModelMapper modelMapper;

    public TeacherDTO saveTeacher(TeacherDTO teacherDTO){

        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
                return teacherDTO;
    }
}