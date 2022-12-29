package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<Education> add(Education education) {
        return new SuccessDataResult<>(educationRepository.save(education),"Education infos added successfully");
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<>(educationRepository.findAll(),"Educations are listed");
    }

}
