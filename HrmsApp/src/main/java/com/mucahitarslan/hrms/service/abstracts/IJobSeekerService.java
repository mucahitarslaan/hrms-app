package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;

import java.util.List;

public interface IJobSeekerService {
    List<JobSeekerResponse> findAll();
    void save(JobSeeker jobSeeker);
}
