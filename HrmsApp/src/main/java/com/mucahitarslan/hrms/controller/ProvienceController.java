package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.Provience;
import com.mucahitarslan.hrms.service.abstracts.IProvienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Provience>> findAll(){
        return new ResponseEntity<>(provienceService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Provience> save(@RequestBody Provience provience){
        return new ResponseEntity<>(provienceService.add(provience), HttpStatus.CREATED);
    }
}
