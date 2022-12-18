package com.mucahitarslan.hrms.mapper;

import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.entity.concretes.JobSeeker;
import org.mapstruct.Mapper;

@Mapper(implementationName = "JobSeekerMapperImpl", componentModel = "spring")
public interface IJobSeekerMapper {
    JobSeeker toJobSeeker(JobSeekerResponse jobSeekerResponse);
    JobSeekerResponse toJobSeekerResponse(JobSeeker jobSeeker);
}
