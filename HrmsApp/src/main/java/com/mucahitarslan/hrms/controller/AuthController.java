package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.security.core.JWTGenerator;
import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.data.model.UserEntity;
import com.mucahitarslan.hrms.security.dataAccess.IRoleSecurityRepository;
import com.mucahitarslan.hrms.security.dataAccess.IUserSecurityRepository;
import com.mucahitarslan.hrms.security.dto.AuthResponseDTO;
import com.mucahitarslan.hrms.security.dto.LoginDTO;
import com.mucahitarslan.hrms.security.dto.RegisterDTO;
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
    private AuthenticationManager authenticationManager;
    private IUserSecurityRepository userSecurityRepository;
    private IRoleSecurityRepository roleSecurityRepository;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager,
                          IUserSecurityRepository userSecurityRepository,
                          IRoleSecurityRepository roleSecurityRepository,
                          PasswordEncoder passwordEncoder,
                          JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.userSecurityRepository = userSecurityRepository;
        this.roleSecurityRepository = roleSecurityRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping("login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginDTO loginDTO){
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUserName(),
                        loginDTO.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        return new ResponseEntity<>(new AuthResponseDTO(token), HttpStatus.OK);
    }

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterDTO registerDTO){
        if (userSecurityRepository.existsByUserName(registerDTO.getUserName())){
            return new ResponseEntity<>("Username is taken", HttpStatus.BAD_REQUEST);
        }
        UserEntity user = new UserEntity();
        user.setUserName(registerDTO.getUserName());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));

        Role roles = roleSecurityRepository.findByName("USER").get();
        user.setRoles(Collections.singletonList(roles));

        userSecurityRepository.save(user);

        return new ResponseEntity<>("User registered success!",HttpStatus.OK);
    }
}
