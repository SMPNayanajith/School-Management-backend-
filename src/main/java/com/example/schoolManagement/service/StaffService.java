package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.DTO.request.StaffUpdateDTO;

public interface StaffService {

    String saveStaff(StaffDTO staffDTO);

    void updateStaff(StaffUpdateDTO staffUpdateDTO);
}
