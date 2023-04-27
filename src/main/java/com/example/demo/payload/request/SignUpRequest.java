package com.example.demo.payload.request;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class SignUpRequest {

    @Email(message = "Is should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String confirmPassword;
}
