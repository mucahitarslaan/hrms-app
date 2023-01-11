package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import com.mucahitarslan.hrms.entity.concretes.Language;
import com.mucahitarslan.hrms.service.abstracts.IJobTitleService;
import com.mucahitarslan.hrms.service.abstracts.ILanguageService;
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
    public DataResult<List<Language>> findAll(){
        return languageService.getAll();
    }

    @PostMapping("/save")
    public DataResult<Language> save(@RequestBody Language language){
        return languageService.add(language);
    }
}
