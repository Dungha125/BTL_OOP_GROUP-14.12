package org.dungha.blooddonateweb.dto.response;

import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private String role;

}