package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.entity.concretes.Skill;
import com.mucahitarslan.hrms.service.abstracts.ISkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillController {
    private final ISkillService skillService;

    public SkillController(ISkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Skill>> findAll(){
        return new ResponseEntity<>(skillService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Skill> save(@RequestBody Skill skill){
        return new ResponseEntity<>(skillService.add(skill), HttpStatus.CREATED);
    }
}
