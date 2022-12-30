package com.mucahitarslan.hrms.security.dto;

public class RegisterDTO {
    private String userName;
    private String password;

    public RegisterDTO() {
    }

    public RegisterDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
