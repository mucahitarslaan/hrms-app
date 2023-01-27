package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.CandidateResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.service.abstracts.ICandidateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/candidates")
public class CandidateController {
    private final ICandidateService candidateService;

    public CandidateController(ICandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<Candidate>>> findAll(){
        return new ResponseEntity<>(candidateService.findAll(), HttpStatus.OK);
    }


    @PostMapping("/register")
    public ResponseEntity<DataResult<Candidate>> register(@RequestBody CandidateRequest candidateRequest){
        return new ResponseEntity<>(candidateService.save(candidateRequest),HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return new ResponseEntity<>(candidateService.authenticate(authenticationRequest), HttpStatus.ACCEPTED);
    }
}
