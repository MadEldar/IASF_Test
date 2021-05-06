package com.example.le_huy_hai_iasf.formEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotNull
    @Size(min = 3)
    private String email;

    @NotNull
    @Size(min = 6)
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
