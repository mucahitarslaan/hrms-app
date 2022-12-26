package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
