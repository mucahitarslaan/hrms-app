package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployerRepository extends JpaRepository<Employer,Long> {

}
