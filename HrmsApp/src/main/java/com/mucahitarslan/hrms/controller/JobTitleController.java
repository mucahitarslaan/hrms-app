package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Experience;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import com.mucahitarslan.hrms.service.abstracts.IExperienceService;
import com.mucahitarslan.hrms.service.abstracts.IJobTitleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobtitles")
public class JobTitleController {
    private final IJobTitleService jobTitleService;

    public JobTitleController(IJobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<JobTitle>>> findAll(){
        return new ResponseEntity<>(jobTitleService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<JobTitle>> save(@RequestBody JobTitle jobTitle){
        return new ResponseEntity<>(jobTitleService.add(jobTitle), HttpStatus.CREATED);
    }
}
