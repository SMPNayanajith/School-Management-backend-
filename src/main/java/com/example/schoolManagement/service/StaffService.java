package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.Repo.StaffRepo;
import com.example.schoolManagement.entity.Staff;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private ModelMapper modelMapper;

    public StaffDTO saveStaff(StaffDTO staffDTO){
        staffRepo.save(modelMapper.map(staffDTO, Staff.class));
        return staffDTO;
    }
}
