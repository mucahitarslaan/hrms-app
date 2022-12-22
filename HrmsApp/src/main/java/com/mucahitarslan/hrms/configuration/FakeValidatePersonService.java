package com.mucahitarslan.hrms.configuration;

import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import org.springframework.stereotype.Service;

@Service("fakeValidatePersonService")
public class FakeValidatePersonService implements IFakeValidatePersonService{
    @Override
    public boolean validate(JobSeekerRequest jobSeekerRequest) {
        return true;
    }
}
