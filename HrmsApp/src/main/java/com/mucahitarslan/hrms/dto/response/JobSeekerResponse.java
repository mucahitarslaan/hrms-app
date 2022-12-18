package com.mucahitarslan.hrms.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.time.LocalDate;


public class JobSeekerResponse {
        private String name;
        private String lastName;
        private String identityId;
        private String mail;
        private LocalDate birthDate;

    public JobSeekerResponse() {
    }

    public JobSeekerResponse(String name, String lastName, String identityId, String mail, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.identityId = identityId;
        this.mail = mail;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
