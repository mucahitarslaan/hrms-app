package com.mucahitarslan.hrms.mapper;

import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import org.mapstruct.Mapper;

@Mapper(implementationName = "JobSeekerMapperImpl", componentModel = "spring")
public interface IJobSeekerMapper {
    Candidate toJobSeeker(JobSeekerResponse jobSeekerResponse);
    JobSeekerResponse toJobSeekerResponse(Candidate candidate);
    Candidate toJobSeeker(JobSeekerRequest jobSeekerRequest);
}