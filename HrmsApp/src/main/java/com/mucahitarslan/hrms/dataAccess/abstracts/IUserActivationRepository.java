package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.UserActivation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserActivationRepository extends JpaRepository<UserActivation,Long> {

}
