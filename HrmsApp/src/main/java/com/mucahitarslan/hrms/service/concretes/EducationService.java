package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IEducationRepository;
import com.mucahitarslan.hrms.entity.concretes.Education;
import com.mucahitarslan.hrms.service.abstracts.IEducationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService {
    private final IEducationRepository educationRepository;

    public EducationService(IEducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @Override
    public Education add(Education education) {
        return educationRepository.save(education);
    }

    @Override
    public List<Education> getAll() {
        return educationRepository.findAll();
    }

}
