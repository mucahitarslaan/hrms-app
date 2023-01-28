package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.JobTitle;

import java.util.List;

public interface IJobTitleService {
    JobTitle add(JobTitle jobTitle);

    List<JobTitle> getAll();
}
