package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import com.mucahitarslan.hrms.service.abstracts.ILinkService;
import com.mucahitarslan.hrms.service.abstracts.INameOfLinksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nameoflinks")
public class NameOfLinksController {
    private final INameOfLinksService nameOfLinksService;

    public NameOfLinksController(INameOfLinksService nameOfLinksService) {
        this.nameOfLinksService = nameOfLinksService;
    }

    @GetMapping
    public DataResult<List<NameOfLinks>> getAll(){
        return nameOfLinksService.getAll();
    }

    @PostMapping
    public DataResult<NameOfLinks> save(@RequestBody NameOfLinks nameOfLinks){
        return nameOfLinksService.add(nameOfLinks);
    }
}
