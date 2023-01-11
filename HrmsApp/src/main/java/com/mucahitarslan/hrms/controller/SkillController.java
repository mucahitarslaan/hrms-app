package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.entity.concretes.Skill;
import com.mucahitarslan.hrms.service.abstracts.IResumeService;
import com.mucahitarslan.hrms.service.abstracts.ISkillService;
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
    public DataResult<List<Skill>> findAll(){
        return skillService.getAll();
    }

    @PostMapping("/save")
    public DataResult<Skill> save(@RequestBody Skill skill){
        return skillService.add(skill);
    }
}
