package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Valid
@Data
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

}
