package com.example.le_huy_hai_iasf.formEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotNull(message = "Email is required")
    @Size(min = 3, message = "Must have at least 3 characters")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Must have at least 6 characters")
    private String password;

    public LoginForm() {
    }

    public LoginForm(@NotNull @Size(min = 3) String email, @NotNull @Size(min = 6) String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
