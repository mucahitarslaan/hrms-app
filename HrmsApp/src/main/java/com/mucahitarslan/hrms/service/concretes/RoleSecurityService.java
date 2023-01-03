package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.dataAccess.IRoleSecurityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleSecurityService {
    private final IRoleSecurityRepository roleSecurityRepository;

    public RoleSecurityService(IRoleSecurityRepository roleSecurityRepository) {
        this.roleSecurityRepository = roleSecurityRepository;
    }

    public Optional<Role> findRoleByName(String roleName){
        return this.roleSecurityRepository.findByName(roleName);
    }
}
