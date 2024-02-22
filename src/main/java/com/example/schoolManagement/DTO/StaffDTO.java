package com.example.schoolManagement.DTO;

public class StaffDTO {
    private long id;
    private String full_name;
    private String email_address;
    private String registration_no;
    private String address;
    private String birthday;

    public StaffDTO() {
    }

    public StaffDTO(long id, String full_name, String email_address, String registration_no, String address, String birthday) {
        this.id = id;
        this.full_name = full_name;
        this.email_address = email_address;
        this.registration_no = registration_no;
        this.address = address;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", registration_no='" + registration_no + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
