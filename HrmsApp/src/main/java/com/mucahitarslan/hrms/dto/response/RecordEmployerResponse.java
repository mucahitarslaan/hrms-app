package com.mucahitarslan.hrms.dto.response;

import lombok.NonNull;

public record RecordEmployerResponse(
        String companyName,
        String webSite,
        String phone,
        String mail
) {
}

