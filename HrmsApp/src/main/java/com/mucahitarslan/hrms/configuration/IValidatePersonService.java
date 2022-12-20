package com.mucahitarslan.hrms.configuration;

import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;

public interface IValidatePersonService {
    boolean validate(JobSeekerRequest jobSeekerRequest);
}
