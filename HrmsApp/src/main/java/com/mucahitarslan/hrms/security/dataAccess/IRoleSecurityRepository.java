package com.mucahitarslan.hrms.security.dataAccess;

import com.mucahitarslan.hrms.security.data.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleSecurityRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String name);

}
