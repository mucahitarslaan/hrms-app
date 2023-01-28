package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Education;

import java.util.List;

public interface IEducationService {
    Education add(Education education);
    List<Education> getAll();
}
