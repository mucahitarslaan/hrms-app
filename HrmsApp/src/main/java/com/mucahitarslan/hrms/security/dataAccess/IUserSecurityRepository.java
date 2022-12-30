package com.mucahitarslan.hrms.security.dataAccess;

import com.mucahitarslan.hrms.security.data.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserSecurityRepository extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity> findByUserName(String userName);
    boolean existsByUserName(String userName);
}
