package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Employer;
import com.mucahitarslan.hrms.entity.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExperienceRepository extends JpaRepository<Experience,Long> {

}
