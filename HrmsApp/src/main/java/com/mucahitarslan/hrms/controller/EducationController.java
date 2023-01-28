package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.Education;
import com.mucahitarslan.hrms.service.abstracts.IEducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/educations")
public class EducationController {
    private final IEducationService educationService;

    public EducationController(IEducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Education>> findAll(){
        return new ResponseEntity<>(educationService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Education> save(@RequestBody Education education){
        return new ResponseEntity<>(educationService.add(education), HttpStatus.CREATED);
    }
}
