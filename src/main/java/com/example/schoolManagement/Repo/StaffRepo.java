package com.example.schoolManagement.Repo;

import com.example.schoolManagement.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff,Long> {
}
