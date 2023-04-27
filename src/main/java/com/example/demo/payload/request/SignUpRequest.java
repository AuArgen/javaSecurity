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
    @NotEmpty(message = "Please enter you name")
    private String firstname;
    @NotEmpty(message = "Please enter you lastname")
    private String lastname;
    @NotEmpty(message = "Please enter you usernmae")
    private String username;
    @NotEmpty(message = "Password i required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
