package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.service.abstracts.IJobSeekerService;
import com.mucahitarslan.hrms.dataAccess.abstracts.IJobSeekerRepository;
import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;
import com.mucahitarslan.hrms.mapper.IJobSeekerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService implements IJobSeekerService {
    private final IJobSeekerRepository jobSeekerRepository;
    private final IJobSeekerMapper jobSeekerMapper;

    public JobSeekerService(IJobSeekerRepository jobSeekerRepository, IJobSeekerMapper jobSeekerMapper) {
        this.jobSeekerRepository = jobSeekerRepository;
        this.jobSeekerMapper = jobSeekerMapper;
    }

    @Override
    public List<JobSeekerResponse> findAll() {
        return jobSeekerRepository.findAll()
                .stream()
                .map(jobSeekerMapper::toJobSeekerResponse)
                .toList();
    }

    @Override
    public void save(JobSeeker jobSeeker) {
        jobSeekerRepository.save(jobSeeker);
    }
}
