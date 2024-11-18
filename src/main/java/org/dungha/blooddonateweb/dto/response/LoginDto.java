package org.dungha.blooddonateweb.dto.response;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;

    // Getters và setters
    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}