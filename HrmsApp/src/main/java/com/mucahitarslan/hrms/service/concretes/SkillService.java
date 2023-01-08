package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<Skill> add(Skill skill) {
        return new SuccessDataResult<>(skillRepository.save(skill),"The skill is saved successfully");
    }

    @Override
    public DataResult<List<Skill>> getAll() {
        return new SuccessDataResult<>(skillRepository.findAll(),"The skills are listed");
    }
}
