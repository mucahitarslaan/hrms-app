package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Education;
import com.mucahitarslan.hrms.entity.concretes.Experience;
import com.mucahitarslan.hrms.service.abstracts.IEducationService;
import com.mucahitarslan.hrms.service.abstracts.IExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/experiences")
public class ExperinceController {
    private final IExperienceService experienceService;

    public ExperinceController(IExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<Experience>>> findAll(){
        return new ResponseEntity<>(experienceService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<Experience>> save(@RequestBody Experience experience){
        return new ResponseEntity<>(experienceService.add(experience), HttpStatus.CREATED);
    }
}
