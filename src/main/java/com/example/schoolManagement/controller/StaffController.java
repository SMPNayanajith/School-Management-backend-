package com.example.schoolManagement.controller;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.DTO.request.StaffUpdateDTO;
import com.example.schoolManagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/staff")
@CrossOrigin

public class    StaffController {
    @Autowired
    private StaffService staffService;
    @PostMapping("post")
    public String saveStaff(@RequestBody StaffDTO staffDTO) {
        staffService.saveStaff(staffDTO);
       return "saved";
    }
    @PutMapping("update")
        public String updateStaff(@RequestBody StaffUpdateDTO staffUpdateDTO){
        staffService.updateStaff(staffUpdateDTO);
        return "updated";
    }


}