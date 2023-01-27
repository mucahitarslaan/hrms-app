package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.ICoverLetterRepository;
import com.mucahitarslan.hrms.entity.concretes.CoverLetter;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import com.mucahitarslan.hrms.service.abstracts.ICoverLetterService;
import com.mucahitarslan.hrms.service.abstracts.INameOfLinksService;
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
    public ResponseEntity<DataResult<List<CoverLetter>>> findAll(){
        return new ResponseEntity<>(coverLetterService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<CoverLetter>> save(@RequestBody CoverLetter coverLetter){
        return new ResponseEntity<>(coverLetterService.save(coverLetter), HttpStatus.CREATED);
    }
}
