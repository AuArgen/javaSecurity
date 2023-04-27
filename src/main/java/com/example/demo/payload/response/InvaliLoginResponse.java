package com.example.demo.payload.response;

public class InvaliLoginResponse {
    private String username;
    private String password;

    public InvaliLoginResponse() {
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }
}
