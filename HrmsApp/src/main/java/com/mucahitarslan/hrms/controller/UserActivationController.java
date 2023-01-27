package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import com.mucahitarslan.hrms.entity.concretes.UserActivation;
import com.mucahitarslan.hrms.service.abstracts.IStaffService;
import com.mucahitarslan.hrms.service.abstracts.IUserActivationService;
import com.mucahitarslan.hrms.service.abstracts.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/useractivations")
public class UserActivationController {
    private final IUserActivationService userActivationService;

    public UserActivationController(IUserActivationService userActivationService) {
        this.userActivationService = userActivationService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<UserActivation>>> findAll(){
        return new ResponseEntity<>(userActivationService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<UserActivation>> save(@RequestBody UserActivation userActivation){
        return new ResponseEntity<>(userActivationService.add(userActivation),HttpStatus.CREATED);
    }
}
