package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.entity.concretes.CoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoverLetterRepository extends JpaRepository<CoverLetter,Long> {

}
