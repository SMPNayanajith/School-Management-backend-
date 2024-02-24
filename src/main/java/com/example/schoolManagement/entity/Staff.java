package com.example.schoolManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Staff")
public class Staff {
    @Id
    @GeneratedValue
    private long id;
    private String full_name;
    private String email_address;
    private String registration_no;
    private String address;
    private String birthday;


}