package com.example.schoolManagement.controller;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/staff")
@CrossOrigin
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("get")
    public String getStaff(){
        return "success";
    }

    @PostMapping("post")
    public StaffDTO saveStaff(@RequestBody StaffDTO staffDTO){
        return staffService.saveStaff(staffDTO);
    }

    @PutMapping("put")
    public String putUser(){
        return "success put";
    }
    @DeleteMapping("delete")
    public String deleteUser(){
        return "success delete";
    }

}
