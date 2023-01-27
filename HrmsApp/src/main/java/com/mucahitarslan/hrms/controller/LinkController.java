package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import com.mucahitarslan.hrms.service.abstracts.ILinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<DataResult<List<Link>>> findAll(){
        return new ResponseEntity<>(linkService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<Link>> save(@RequestBody Link link){
        return new ResponseEntity<>(linkService.add(link),HttpStatus.CREATED);
    }
}
