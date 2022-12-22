package com.mucahitarslan.hrms.configuration;

import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;

public interface IFakeValidatePersonService {
    boolean validate(JobSeekerRequest jobSeekerRequest);
}
