package com.example.le_huy_hai_iasf.formEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.Date;

public class StudentForm {
    @NotNull(message = "Full name is required")
    @Size(min = 3, message = "Must have at least 3 characters")
    private String fullName;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Must have at least 6 characters")
    private String password;

    @NotNull(message = "Confirm password is required")
    @Size(min = 6, message = "Must have at least 6 characters")
    private String confirmPassword;

    @NotNull(message = "Gender is required")
    private String gender;

    @NotNull(message = "Email is required")
    @Size(min = 3, message = "Must have at least 3 characters")
    private String email;

    @NotNull(message = "Phone is required")
    @Size(min = 10, max = 10, message = "Must have exactly 10 characters")
    private String phone;

    private Date dob;

    @NotNull(message = "Hometown is required")
    @Size(min = 1, message = "Must have at least 3 characters")
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
