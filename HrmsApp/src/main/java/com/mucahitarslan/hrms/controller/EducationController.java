package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Education;
import com.mucahitarslan.hrms.service.abstracts.IEducationService;
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
    public DataResult<List<Education>> findAll(){
        return educationService.getAll();
    }

    @PostMapping("/save")
    public DataResult<Education> save(@RequestBody Education education){
        return educationService.add(education);
    }
}
