package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.service.abstracts.IResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resumes")
public class ResumeController {
    private final IResumeService resumeService;

    public ResumeController(IResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Resume>> findAll(){
        return new ResponseEntity<>(resumeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Resume> save(@RequestBody Resume resume){
        return new ResponseEntity<>(resumeService.add(resume), HttpStatus.CREATED);
    }
}
