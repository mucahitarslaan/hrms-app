package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Education;

import java.util.List;

public interface IEducationService {
    DataResult<Education> add(Education education);
    DataResult<List<Education>> getAll();
}
