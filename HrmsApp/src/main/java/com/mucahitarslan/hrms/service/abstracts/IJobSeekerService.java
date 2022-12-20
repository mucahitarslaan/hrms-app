package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;

import java.util.List;

public interface IJobSeekerService {
    DataResult<List<JobSeekerResponse>> findAll();
    DataResult<JobSeekerResponse> save(JobSeekerRequest jobSeekerRequest);
}
