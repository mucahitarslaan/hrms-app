package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.security.core.JWTGenerator;
import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.data.model.UserEntity;
import com.mucahitarslan.hrms.security.dto.AuthResponseDTO;
import com.mucahitarslan.hrms.security.dto.LoginDTO;
import com.mucahitarslan.hrms.security.dto.RegisterDTO;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final UserEntityService userEntityService;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final RoleSecurityService roleSecurityService;

    public AuthenticationService(AuthenticationManager authenticationManager,

                                 UserEntityService userEntityService, PasswordEncoder passwordEncoder,
                                 JwtService jwtService, RoleSecurityService roleSecurityService) {
        this.authenticationManager = authenticationManager;
        this.userEntityService = userEntityService;

        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
        this.roleSecurityService = roleSecurityService;
    }



    public AuthResponseDTO register(RegisterDTO registerDTO){
        var roles = roleSecurityService.findRoleByName("USER").get();
        var user = new UserEntity();
        user.setUserName(registerDTO.getUserName());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        user.setRoles(Collections.singletonList(roles));

        userEntityService.registerNewUserEntity(user);

        var jwtToken = jwtService.generateToken(user);
        return new AuthResponseDTO(jwtToken);
    }

    public AuthResponseDTO authenticate(LoginDTO loginDTO){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDTO.getUserName(),
                        loginDTO.getPassword()
                )
        );
        var user = userEntityService.findByUserName(loginDTO.getUserName())
                .orElseThrow();
        var jtwToken = jwtService.generateToken(user);
        return new AuthResponseDTO(jtwToken);
    }

}
