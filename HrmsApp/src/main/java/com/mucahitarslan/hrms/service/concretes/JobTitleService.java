package com.mucahitarslan.hrms.service.concretes;

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
    public JobTitle add(JobTitle jobTitle) {
        return jobTitleRepository.save(jobTitle);
    }

    @Override
    public List<JobTitle> getAll() {
        return jobTitleRepository.findAll();
    }
}
