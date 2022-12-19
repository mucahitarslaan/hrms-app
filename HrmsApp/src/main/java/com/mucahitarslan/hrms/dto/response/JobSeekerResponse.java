package com.mucahitarslan.hrms.dto.response;

import java.time.LocalDate;


public record JobSeekerResponse (
        String name,
        String lastName,
        String identityId,
        String mail,
        LocalDate birthDate
){
}