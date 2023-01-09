package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Provience;
import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.service.abstracts.IProvienceService;
import com.mucahitarslan.hrms.service.abstracts.IResumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resumes")
public class ResumeController {
    private final IResumeService resumeService;

    public ResumeController(IResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping
    public DataResult<List<Resume>> getAll(){
        return resumeService.getAll();
    }

    @PostMapping
    public DataResult<Resume> save(@RequestBody Resume resume){
        return resumeService.add(resume);
    }
}
