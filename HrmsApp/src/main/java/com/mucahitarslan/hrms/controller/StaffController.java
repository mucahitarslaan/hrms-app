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
    public DataResult<List<Staff>> findAll(){
        return staffService.getAll();
    }

    @PostMapping("/register")
    public DataResult<Staff> register(@RequestBody StaffRequest staffRequest){
        return staffService.save(staffRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        return staffService.authenticate(authenticationRequest);
    }
}
