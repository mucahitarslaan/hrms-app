package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.request.StaffRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.entity.concretes.Skill;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import com.mucahitarslan.hrms.service.abstracts.ISkillService;
import com.mucahitarslan.hrms.service.abstracts.IStaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staffs")
public class StaffController {
    private final IStaffService staffService;

    public StaffController(IStaffService staffService) {
        this.staffService = staffService;
    }


    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<Staff>>> findAll(){
        return new ResponseEntity<>(staffService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<DataResult<Staff>> register(@RequestBody StaffRequest staffRequest){
        return new ResponseEntity<>(staffService.save(staffRequest), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return new ResponseEntity<>(staffService.authenticate(authenticationRequest), HttpStatus.ACCEPTED);
    }
}
