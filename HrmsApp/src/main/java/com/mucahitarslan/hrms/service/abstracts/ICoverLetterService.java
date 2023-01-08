package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Address;
import com.mucahitarslan.hrms.entity.concretes.CoverLetter;

import java.util.List;

public interface ICoverLetterService {
    DataResult<List<CoverLetter>> findAll();

    DataResult<CoverLetter> save(CoverLetter coverLetter);
}
