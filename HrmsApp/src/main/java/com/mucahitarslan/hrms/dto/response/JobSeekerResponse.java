package com.mucahitarslan.hrms.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;


public record JobSeekerResponse (
        String name,
        String lastName,
        String identityId,
        String mail,
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate birthDate
){
}