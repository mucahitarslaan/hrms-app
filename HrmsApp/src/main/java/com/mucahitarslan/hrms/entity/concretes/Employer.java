package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Valid
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employer extends User {

    @NotNull
    @NotBlank
    private String companyName;

    @NotNull
    @NotBlank
    private String webSite;

    @NotNull
    @NotBlank
    private String phoneNumber;

    public Employer() {
    }

    public Employer(String companyName, String webSite, String phoneNumber) {
        this.companyName = companyName;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
