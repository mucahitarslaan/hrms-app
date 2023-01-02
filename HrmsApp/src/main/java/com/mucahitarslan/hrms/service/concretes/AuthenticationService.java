package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.data.model.UserEntity;
import com.mucahitarslan.hrms.security.dataAccess.IUserSecurityRepository;
import com.mucahitarslan.hrms.security.request.AuthenticationRequest;
import com.mucahitarslan.hrms.security.request.RegisterRequest;
import com.mucahitarslan.hrms.security.response.AuthenticationResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
   private final IUserSecurityRepository repository;
   private final PasswordEncoder passwordEncoder;
   private final JwtService jwtService;
   private final AuthenticationManager authenticationManager;

    public AuthenticationService(IUserSecurityRepository repository, PasswordEncoder passwordEncoder, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    public AuthenticationResponse register(RegisterRequest request) {
//        var user = UserEntity.builder()
//                .userName(request.getUserName())
//                .password(passwordEncoder.encode(request.getPassword()))
//                .role(Role.USER).build();
        var user = new UserEntity(request.getUserName(),Role.USER,passwordEncoder.encode(request.getPassword()));
        repository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return new AuthenticationResponse(jwtToken);
//        return AuthenticationResponse.builder()
//                .token(jwtToken).build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),
                        request.getPassword()
                )
        );
        var user = repository.findByUserName(request.getUserName())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return new AuthenticationResponse(jwtToken);
    }
}
