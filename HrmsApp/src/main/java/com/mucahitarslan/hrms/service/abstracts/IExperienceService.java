package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Experience;

import java.util.List;

public interface IExperienceService {
    Experience add(Experience experience);

    List<Experience> getAll();
}
