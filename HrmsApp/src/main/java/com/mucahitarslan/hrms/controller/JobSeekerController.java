package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;
import com.mucahitarslan.hrms.service.abstracts.IJobSeekerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobseekers")
public class JobSeekerController {
    private final IJobSeekerService jobSeekerService;


    public JobSeekerController(IJobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping()
    public List<JobSeekerResponse> getAll(){
        return jobSeekerService.findAll();
    }

    @PostMapping()
    public void add(@RequestBody JobSeeker jobSeeker){
        jobSeekerService.save(jobSeeker);
    }
}
