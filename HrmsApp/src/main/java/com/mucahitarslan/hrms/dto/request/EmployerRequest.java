package com.mucahitarslan.hrms.dto.request;

public class EmployerRequest{
    private String companyName;
    private String webSite;
    private String phone;
    private String email;
    private String password;
    private String rePassword;

    public EmployerRequest() {
    }

    public EmployerRequest(String companyName, String webSite, String phone,
                           String email, String password, String rePassword) {
        this.companyName = companyName;
        this.webSite = webSite;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.rePassword = rePassword;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}

