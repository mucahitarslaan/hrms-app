package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IJobTitleRepository;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import com.mucahitarslan.hrms.service.abstracts.IJobTitleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleService implements IJobTitleService {
    private final IJobTitleRepository jobTitleRepository;

    public JobTitleService(IJobTitleRepository jobTitleRepository) {
        this.jobTitleRepository = jobTitleRepository;
    }

    @Override
    public DataResult<JobTitle> add(JobTitle jobTitle) {
        return new SuccessDataResult<>(jobTitleRepository.save(jobTitle),"The job title is saved successfully");
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<>(jobTitleRepository.findAll(),"The job titles are listed");
    }
}
