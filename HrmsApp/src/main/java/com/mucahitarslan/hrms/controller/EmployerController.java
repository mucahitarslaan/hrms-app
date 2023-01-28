package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.service.abstracts.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<EmployerResponse>> findAll(){
        return new ResponseEntity<>(employerService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<EmployerResponse> save(@RequestBody EmployerRequest employerRequest){
        return new ResponseEntity<>(employerService.save(employerRequest), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return new ResponseEntity<>(employerService.authenticate(authenticationRequest), HttpStatus.ACCEPTED);
    }

}
