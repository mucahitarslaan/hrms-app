package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import com.mucahitarslan.hrms.entity.concretes.Language;
import com.mucahitarslan.hrms.service.abstracts.IJobTitleService;
import com.mucahitarslan.hrms.service.abstracts.ILanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/languages")
public class LanguageController {
    private final ILanguageService languageService;

    public LanguageController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<DataResult<List<Language>>> findAll(){
        return new ResponseEntity<>(languageService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<Language>> save(@RequestBody Language language){
        return new ResponseEntity<>(languageService.add(language), HttpStatus.CREATED);
    }
}
