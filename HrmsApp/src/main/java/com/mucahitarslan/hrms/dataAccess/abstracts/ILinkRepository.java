package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Address;
import com.mucahitarslan.hrms.entity.concretes.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILinkRepository extends JpaRepository<Link,Long> {

}
