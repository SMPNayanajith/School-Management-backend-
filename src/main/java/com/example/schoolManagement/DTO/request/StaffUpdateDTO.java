package com.example.schoolManagement.DTO.request;

import org.springframework.stereotype.Component;

@Component

public class StaffUpdateDTO {
    private String email_address;
    private String registration_no;
    private String address;

    public StaffUpdateDTO(String email_address, String registration_no, String address) {
        this.email_address = email_address;
        this.registration_no = registration_no;
        this.address = address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getRegistration_no() {
        return registration_no;
    }

    public void setRegistration_no(String registration_no) {
        this.registration_no = registration_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StaffUpdateDTO() {
    }


    public String toString() {
        return "StaffUpdateDTO{" +
                "email_address='" + email_address + '\'' +
                ", registration_no='" + registration_no + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
