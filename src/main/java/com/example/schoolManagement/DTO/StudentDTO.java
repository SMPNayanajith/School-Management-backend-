package com.example.schoolManagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO {
    private long id;
    private String full_name;
    private String email_address;
    private String registration_no;
    private String address;
    private String birthday;
}
