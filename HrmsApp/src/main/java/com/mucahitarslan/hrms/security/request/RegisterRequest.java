package com.mucahitarslan.hrms.security.request;

import com.mucahitarslan.hrms.security.data.model.Role;
import lombok.Builder;

@Builder
public class RegisterRequest {
    private String userName;
    private String password;
    private Role role;

    public RegisterRequest() {
    }

    public RegisterRequest(String userName, String password, Role role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
