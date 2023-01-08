package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;

import java.util.List;

public interface IJobTitleService {
    DataResult<JobTitle> add(JobTitle jobTitle);

    DataResult<List<JobTitle>> getAll();
}
