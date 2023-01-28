package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import com.mucahitarslan.hrms.service.abstracts.INameOfLinksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nameoflinks")
public class NameOfLinksController {
    private final INameOfLinksService nameOfLinksService;

    public NameOfLinksController(INameOfLinksService nameOfLinksService) {
        this.nameOfLinksService = nameOfLinksService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<NameOfLinks>> findAll(){
        return new ResponseEntity<>(nameOfLinksService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<NameOfLinks> save(@RequestBody NameOfLinks nameOfLinks){
        return new ResponseEntity<>(nameOfLinksService.add(nameOfLinks),HttpStatus.CREATED);
    }
}
