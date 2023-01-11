package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Language;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import com.mucahitarslan.hrms.service.abstracts.ILanguageService;
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
    public DataResult<List<LanguageLevel>> findAll(){
        return languageLevelService.getAll();
    }

    @PostMapping("/save")
    public DataResult<LanguageLevel> save(@RequestBody LanguageLevel languageLevel){
        return languageLevelService.add(languageLevel);
    }
}
