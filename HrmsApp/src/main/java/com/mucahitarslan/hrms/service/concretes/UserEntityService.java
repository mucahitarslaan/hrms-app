package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.security.data.model.UserEntity;
import com.mucahitarslan.hrms.security.dataAccess.IUserSecurityRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserEntityService {
    private final IUserSecurityRepository userSecurityRepository;

    public UserEntityService(IUserSecurityRepository userSecurityRepository) {
        this.userSecurityRepository = userSecurityRepository;
    }

    public Optional<UserEntity> findByUserName(String userName){
        return userSecurityRepository.findByUserName(userName);
    }

    public boolean isUserExists(String userName){
        return userSecurityRepository.existsByUserName(userName);
    }

    public UserEntity registerNewUserEntity(UserEntity user){
        return userSecurityRepository.save(user);
    }
}
