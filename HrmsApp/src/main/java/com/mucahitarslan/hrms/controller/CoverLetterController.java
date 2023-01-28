package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.CoverLetter;
import com.mucahitarslan.hrms.service.abstracts.ICoverLetterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/converletters")
public class CoverLetterController {
    private final ICoverLetterService coverLetterService;

    public CoverLetterController(ICoverLetterService coverLetterService) {
        this.coverLetterService = coverLetterService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<CoverLetter>> findAll(){
        return new ResponseEntity<>(coverLetterService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CoverLetter> save(@RequestBody CoverLetter coverLetter){
        return new ResponseEntity<>(coverLetterService.save(coverLetter), HttpStatus.CREATED);
    }
}
