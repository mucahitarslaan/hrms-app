package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.entity.concretes.Provience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvienceRepository extends JpaRepository<Provience,Integer> {

}
