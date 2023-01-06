package com.mucahitarslan.hrms.mapper;

import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.CandidateResponse;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.entity.concretes.Employer;
import org.mapstruct.Mapper;

@Mapper(implementationName = "CandidateMapperImpl", componentModel = "spring")
public interface ICandidateMapper {
    Candidate toCandidate(CandidateRequest candidateRequest);

    CandidateResponse toCandidateResponse(Candidate candidate);

}
