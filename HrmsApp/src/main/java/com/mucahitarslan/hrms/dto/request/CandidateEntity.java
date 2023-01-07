package com.mucahitarslan.hrms.dto.request;

import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.entity.concretes.Role;
import org.springframework.stereotype.Component;

@Component
public class CandidateEntity {
    public Candidate toCandidate(CandidateRequest candidateRequest){
        Candidate candidate = new Candidate();
        candidate.setFirstName(candidateRequest.getFirstName());
        candidate.setLastName(candidateRequest.getLastName());
        candidate.setIdentityNumber(candidateRequest.getIdentityNumber());
        //candidate.setDateOfBirth(candidateRequest.getDateOfBirth());
        candidate.setPassword(candidateRequest.getPassword());
        candidate.setEmail(candidateRequest.getEmail());
        candidate.setRole(Role.USER);
        return candidate;
    }
}
