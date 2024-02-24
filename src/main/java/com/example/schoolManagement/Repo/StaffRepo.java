package com.example.schoolManagement.Repo;

import com.example.schoolManagement.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StaffRepo extends JpaRepository<Staff,Long> {
}
