package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INameOfLinksRepository extends JpaRepository<NameOfLinks,Long> {

}
