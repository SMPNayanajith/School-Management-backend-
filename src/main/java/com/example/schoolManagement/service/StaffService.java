package com.example.schoolManagement.service;

import com.example.schoolManagement.DTO.StaffDTO;
import com.example.schoolManagement.Repo.StaffRepo;
import com.example.schoolManagement.entity.Staff;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
    public List<StaffDTO> getAllStaff(){
        List<Staff>staffList=staffRepo.findAll();
        return modelMapper.map(staffList,new TypeToken<List<StaffDTO>>(){}.getType());
    }
    public StaffDTO updateStaff(StaffDTO staffDTO) {
        staffRepo.save(modelMapper.map(staffDTO, Staff.class));
        return staffDTO;
    }



    public boolean deleteStaff(@PathVariable Long id){
        staffRepo.deleteById(id);
        return true; // Or handle the return value as needed
    }

}
