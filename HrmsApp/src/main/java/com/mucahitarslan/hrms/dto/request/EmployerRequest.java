package com.mucahitarslan.hrms.dto.request;

public record EmployerRequest (
        String companyName,
        String webSite,
        String phone,
        String email,
        String password,
        String rePassword
){
}