package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import com.mucahitarslan.hrms.entity.concretes.Provience;
import com.mucahitarslan.hrms.service.abstracts.INameOfLinksService;
import com.mucahitarslan.hrms.service.abstracts.IProvienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/proviences")
public class ProvienceController {
    private final IProvienceService provienceService;

    public ProvienceController(IProvienceService provienceService) {
        this.provienceService = provienceService;
    }

    @GetMapping("/findAll")
    public DataResult<List<Provience>> findAll(){
        return provienceService.getAll();
    }

    @PostMapping("/save")
    public DataResult<Provience> save(@RequestBody Provience provience){
        return provienceService.add(provience);
    }
}
