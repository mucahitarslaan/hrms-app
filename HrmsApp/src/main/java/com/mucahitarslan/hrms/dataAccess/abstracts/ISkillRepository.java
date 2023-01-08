package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.entity.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISkillRepository extends JpaRepository<Skill,Long> {

}
