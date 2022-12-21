package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobTitleRepository extends JpaRepository<JobTitle,Long> {
}
