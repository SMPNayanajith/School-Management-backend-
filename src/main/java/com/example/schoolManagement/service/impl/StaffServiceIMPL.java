package com.example.schoolManagement.service.impl;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.DTO.request.StaffUpdateDTO;
import com.example.schoolManagement.Repo.StaffRepo;
import com.example.schoolManagement.entity.Staff;
import com.example.schoolManagement.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StaffServiceIMPL implements StaffService {
    @Autowired
    private StaffRepo staffRepo;
    @Override
    public String saveStaff(StaffDTO staffDTO) {

        Staff staff=new Staff(
                staffDTO.getId(),
                staffDTO.getFull_name(),
                staffDTO.getEmail_address(),
                staffDTO.getRegistration_no(),
                staffDTO.getAddress(),
                staffDTO.getBirthday()

        );

        staffRepo.save(staff);
        return staffDTO.getAddress();
    }
    @Autowired
    private StaffUpdateDTO staffUpdateDTO;
    @Override
    public void updateStaff(StaffUpdateDTO staffUpdateDTO) {
        // Implement the update logic here
    }

}

