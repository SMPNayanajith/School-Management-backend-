package com.example.schoolManagement.controller;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.Repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.schoolManagement.entity.Staff;

@RestController
@RequestMapping("api/v1/staff")
@CrossOrigin

public class    StaffController {

    @PostMapping
    public String saveStaff(@RequestBody StaffDTO staffDTO) {
        String massage =staffDTO.getAddress();
        return massage;
    }


}