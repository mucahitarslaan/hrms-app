package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
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
    public DataResult<List<JobSeekerResponse>> getAll(){
        return jobSeekerService.findAll();
    }

    @PostMapping()
    public DataResult<JobSeekerResponse> add(@RequestBody JobSeekerRequest jobSeekerRequest){
        return jobSeekerService.save(jobSeekerRequest);
    }
}
