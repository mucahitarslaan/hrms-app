package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Skill;

import java.util.List;

public interface ISkillService {
    Skill add(Skill skill);

    List<Skill> getAll();
}
