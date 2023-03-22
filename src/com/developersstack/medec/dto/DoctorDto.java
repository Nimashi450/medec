package com.developersstack.medec.dto;

import com.developersstack.medec.enums.Gender;

public class DoctorDto {
    private String firstName;
    private String lastName;
    private String nic;
    private String contact;
    private String email;
    private Gender gender;
    private String specialization;
    private String address;



    public DoctorDto() {
    }

    public DoctorDto(String firstName, String lastName, String nic, String contact, String email, Gender gender, String specialization, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.specialization = specialization;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
