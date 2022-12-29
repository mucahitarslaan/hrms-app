package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.ICandidateRepository;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.service.abstracts.ICandidateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService implements ICandidateService {
    private final ICandidateRepository candidateRepository;

    public CandidateService(ICandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public DataResult<List<Candidate>> findAll() {
        return new SuccessDataResult<>(candidateRepository.findAll(),"All candidates are listed");
    }

    @Override
    public DataResult<Candidate> save(Candidate candidate) {
        return new SuccessDataResult<>(candidateRepository.save(candidate),"The candidate is saved");
    }
}
