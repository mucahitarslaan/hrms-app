package com.mucahitarslan.hrms.dto.request;

import java.time.LocalDate;

public record JobSeekerRequest (
        String name,
        String lastName,
        String identityId,
        String mail,
        LocalDate birthDate,
        String password,
        String rePassword
) {
}
