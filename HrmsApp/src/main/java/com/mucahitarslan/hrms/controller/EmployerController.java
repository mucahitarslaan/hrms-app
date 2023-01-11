package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.service.abstracts.IEmployerService;
import com.mucahitarslan.hrms.service.concretes.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employers")
public class EmployerController {
    private final IEmployerService employerService;

    @Autowired
    public EmployerController(IEmployerService employerService) {
        this.employerService = employerService;

    }

    @GetMapping("/findAll")
    public DataResult<List<EmployerResponse>> findAll(){
        return employerService.findAll();
    }

    @PostMapping("/register")
    public DataResult<EmployerResponse> save(@RequestBody EmployerRequest employerRequest){
        return employerService.save(employerRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return employerService.authenticate(authenticationRequest);
    }

}
