package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Skill;

import java.util.List;

public interface ISkillService {
    DataResult<Skill> add(Skill skill);

    DataResult<List<Skill>> getAll();
}
