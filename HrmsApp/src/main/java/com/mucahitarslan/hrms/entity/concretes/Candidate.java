package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Candidate extends User {

    @NotNull
    @NotBlank
    private String firstName;

    @NotNull
    @NotBlank
    private String lastName;

    @NotNull
    @NotBlank
    @Size(min = 11, max = 11)
    @Column(unique = true)
    private String identityNumber;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL)
    private List<Education> educations;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Experience> experiences;


    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Language> languages;


    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Skill> skills;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Resume> resumes;



    public Candidate() {
    }

    public Candidate(String firstName, String lastName, String identityNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
