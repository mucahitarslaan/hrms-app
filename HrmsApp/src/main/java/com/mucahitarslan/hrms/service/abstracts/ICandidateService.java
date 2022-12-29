package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Candidate;

import java.util.List;

public interface ICandidateService {
    DataResult<List<Candidate>> findAll();
    DataResult<Candidate> save(Candidate candidate);
}
