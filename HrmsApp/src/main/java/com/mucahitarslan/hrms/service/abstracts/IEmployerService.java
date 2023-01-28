package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;

import java.util.List;

public interface IEmployerService{
    List<EmployerResponse> findAll();
    EmployerResponse save(EmployerRequest employerRequest);

    AuthenticationResponse authenticate (AuthenticationRequest authenticationRequest);
}
