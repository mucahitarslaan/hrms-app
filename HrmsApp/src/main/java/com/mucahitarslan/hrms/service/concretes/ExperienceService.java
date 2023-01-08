package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IExperienceRepository;
import com.mucahitarslan.hrms.entity.concretes.Experience;
import com.mucahitarslan.hrms.service.abstracts.IExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements IExperienceService {

    private final IExperienceRepository experienceRepository;

    public ExperienceService(IExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public DataResult<Experience> add(Experience experience) {
        return new SuccessDataResult<>(experienceRepository.save(experience),"The experience is saved successfully");
    }

    @Override
    public DataResult<List<Experience>> getAll() {
        return new SuccessDataResult<>(experienceRepository.findAll(),"The experiences are listed");
    }
}
