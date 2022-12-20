package com.mucahitarslan.hrms.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record JobSeekerRequest (
        String name,
        String lastName,
        String identityId,
        String mail,
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate birthDate,
        String password,
        String rePassword
) {
}
