package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import com.mucahitarslan.hrms.service.abstracts.ILinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/links")
public class LinkController {
    private final ILinkService linkService;

    public LinkController(ILinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/findAll")
    public DataResult<List<Link>> findAll(){
        return linkService.getAll();
    }

    @PostMapping("/save")
    public DataResult<Link> save(@RequestBody Link link){
        return linkService.add(link);
    }
}
