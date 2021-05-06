package com.example.le_huy_hai_iasf.formEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.Date;

public class StudentForm {
    @NotNull
    @Size(min = 3)
    private String fullName;

    @NotNull
    @Size(min = 6)
    private String password;

    @NotNull
    @Size(min = 6)
    private String confirmPassword;

    @NotNull
    private String gender;

    @NotNull
    @Size(min = 3)
    private String email;

    @NotNull
    @Size(min = 10, max = 10)
    private String phone;

    private Date dob;

    @NotNull
    @Size(min = 1)
    private String hometown;

    public StudentForm() {
    }

    public StudentForm(@NotNull @Size(min = 3) String fullName, @NotNull @Size(min = 6) String password, @NotNull @Size(min = 6) String confirmPassword, @NotNull String gender, @NotNull @Size(min = 3) String email, @NotNull @Size(min = 10, max = 10) String phone, @NotNull @Size(min = 1) String hometown) {
        this.fullName = fullName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        Calendar instance = Calendar.getInstance();
        this.dob = instance.getTime();
        this.hometown = hometown;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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
