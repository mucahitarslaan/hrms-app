package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.entity.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IResumeRepository extends JpaRepository<Resume,Long> {

}
