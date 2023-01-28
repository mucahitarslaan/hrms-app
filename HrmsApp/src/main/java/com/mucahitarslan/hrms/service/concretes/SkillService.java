package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.ISkillRepository;
import com.mucahitarslan.hrms.entity.concretes.Skill;
import com.mucahitarslan.hrms.service.abstracts.ISkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService {

    private final ISkillRepository skillRepository;

    public SkillService(ISkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill add(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }
}
