package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.CandidateResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.service.concretes.CandidateService;

import java.util.List;

public interface ICandidateService {
    DataResult<List<Candidate>> findAll();
    DataResult<Candidate> save(CandidateRequest candidateRequest);

    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);
}
