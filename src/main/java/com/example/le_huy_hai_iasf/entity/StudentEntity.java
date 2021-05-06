package com.example.le_huy_hai_iasf.entity;

import com.example.le_huy_hai_iasf.formEntity.StudentForm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "hometown")
    private String hometown;

    public StudentEntity() {
    }

    public StudentEntity(String fullName, String password, String gender, String email, String phone, Date dob, String hometown) {
        this.fullName = fullName;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.hometown = hometown;
    }

    public StudentEntity(StudentForm studentForm) {
        this.fullName = studentForm.getFullName();
        this.password = studentForm.getPassword();
        this.gender = studentForm.getGender();
        this.email = studentForm.getEmail();
        this.phone = studentForm.getPhone();
        this.dob = studentForm.getDob();
        this.hometown = studentForm.getHometown();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
