package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.StudentDTO;
import com.example.schoolManagement.DTO.TeacherDTO;
import com.example.schoolManagement.Repo.TeacherRepo;
import com.example.schoolManagement.entity.Student;
import com.example.schoolManagement.entity.Teacher;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
    public List<TeacherDTO> getAllTeacher(){
        List<Teacher>teacherList=teacherRepo.findAll();
        return modelMapper.map(teacherList,new TypeToken<List<TeacherDTO>>(){}.getType());
    }

    public TeacherDTO updateTeacher(TeacherDTO teacherDTO){

        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
        return teacherDTO;
    }

    public boolean deleteTeacher(@PathVariable Long id){
        teacherRepo.deleteById(id);
        return true;

    }
}

