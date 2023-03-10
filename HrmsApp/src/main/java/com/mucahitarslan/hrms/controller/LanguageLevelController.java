package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/languagelevels")
public class LanguageLevelController {
    private final ILanguageLevelService languageLevelService;

    public LanguageLevelController(ILanguageLevelService languageLevelService) {
        this.languageLevelService = languageLevelService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<LanguageLevel>> findAll(){
        return new ResponseEntity<>(languageLevelService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<LanguageLevel> save(@RequestBody LanguageLevel languageLevel){
        return new ResponseEntity<>(languageLevelService.add(languageLevel), HttpStatus.CREATED);
    }
}
