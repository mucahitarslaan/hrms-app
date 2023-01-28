package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;

import java.util.List;

public interface ICandidateService {
    List<Candidate> findAll();
    Candidate save(CandidateRequest candidateRequest);

    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);
}
