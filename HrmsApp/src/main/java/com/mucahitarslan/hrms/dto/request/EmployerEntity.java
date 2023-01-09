package com.mucahitarslan.hrms.dto.request;

import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.entity.concretes.Employer;
import com.mucahitarslan.hrms.entity.concretes.Role;
import org.springframework.stereotype.Component;

@Component
public class EmployerEntity {
    public Employer toEmployer(EmployerRequest employerRequest){
        Employer employer = new Employer();
        employer.setCompanyName(employerRequest.getCompanyName());
        employer.setWebSite(employerRequest.getWebSite());
        employer.setEmail(employerRequest.getEmail());
        employer.setRole(Role.USER);
        employer.setPhoneNumber(employerRequest.getPhone());
        employer.setPassword(employerRequest.getPassword());
        return employer;
    }
}
