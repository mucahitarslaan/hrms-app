package com.mucahitarslan.hrms.dto.request;

public record EmployerRequest (
        String companyName,
        String webSite,
        String phone,
        String mail,
        String password,
        String rePassword
){
}