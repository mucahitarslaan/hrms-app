package com.mucahitarslan.hrms.service.concretes;

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
    public Experience add(Experience experience) {
        return experienceRepository.save(experience);
    }

    @Override
    public List<Experience> getAll() {
        return experienceRepository.findAll();
    }
}
