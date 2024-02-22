package com.example.schoolManagement.Repo;

import com.example.schoolManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
