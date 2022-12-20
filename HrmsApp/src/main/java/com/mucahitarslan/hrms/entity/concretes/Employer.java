package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employers")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Valid
public class Employer extends User {
    @NotNull
    private String companyName;
    @NotNull
    private String webSite;
    @NotNull
    @Pattern(regexp = "^+(\\d{2})\\s((\\d{3}))\\s(\\d{3})\\s(\\d{2})\\s(\\d{2})")
    private String phone;

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
}
