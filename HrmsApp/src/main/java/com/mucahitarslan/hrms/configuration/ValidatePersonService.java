package com.mucahitarslan.hrms.configuration;

import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import mernis.CSDKPSPublicSoap;
import org.springframework.stereotype.Service;

@Service("mernis")
public class ValidatePersonService implements IValidatePersonService{

    private final CSDKPSPublicSoap publicSoap = new CSDKPSPublicSoap();

    @Override
    public boolean validate(JobSeekerRequest jobSeekerRequest){
        try {
          return publicSoap.TCKimlikNoDogrula(Long.valueOf(jobSeekerRequest.identityId()),
                   jobSeekerRequest.name(),
                   jobSeekerRequest.lastName(),
                   jobSeekerRequest.birthDate().getYear());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public ValidatePersonService() {
    }

}
