package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import com.mucahitarslan.hrms.service.abstracts.ILinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/links")
public class LinkController {
    private final ILinkService linkService;

    public LinkController(ILinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    public DataResult<List<Link>> getAll(){
        return linkService.getAll();
    }

    @PostMapping
    public DataResult<Link> add(@RequestBody Link link){
        return linkService.add(link);
    }
}
