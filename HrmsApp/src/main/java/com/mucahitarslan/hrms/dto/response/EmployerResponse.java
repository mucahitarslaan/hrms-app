package com.mucahitarslan.hrms.dto.response;


public class EmployerResponse {
    private String companyName;
    private String webSite;
    private String phone;
    private String mail;

    public EmployerResponse() {
    }

    public EmployerResponse(String companyName, String webSite, String phone, String mail) {
        this.companyName = companyName;
        this.webSite = webSite;
        this.phone = phone;
        this.mail = mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}