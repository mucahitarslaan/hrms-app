package com.mucahitarslan.hrms.dto.request;

public record AuthenticationRequest(
        String email,
        String password
) {
}
