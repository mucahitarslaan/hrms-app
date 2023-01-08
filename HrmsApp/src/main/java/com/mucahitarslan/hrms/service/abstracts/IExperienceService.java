package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Experience;

import java.util.List;

public interface IExperienceService {
    DataResult<Experience> add(Experience experience);

    DataResult<List<Experience>> getAll();
}
