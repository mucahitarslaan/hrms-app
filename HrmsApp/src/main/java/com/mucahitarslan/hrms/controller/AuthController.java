package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.security.core.JWTGenerator;
import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.data.model.UserEntity;
import com.mucahitarslan.hrms.security.dataAccess.IRoleSecurityRepository;
import com.mucahitarslan.hrms.security.dataAccess.IUserSecurityRepository;
import com.mucahitarslan.hrms.security.dto.AuthResponseDTO;
import com.mucahitarslan.hrms.security.dto.LoginDTO;
import com.mucahitarslan.hrms.security.dto.RegisterDTO;
import com.mucahitarslan.hrms.service.concretes.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    @PostMapping("login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginDTO loginDTO){
        return ResponseEntity.ok(authenticationService.authenticate(loginDTO));
    }

    @PostMapping("register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody RegisterDTO registerDTO){
        return ResponseEntity.ok(authenticationService.register(registerDTO));
    }
}
