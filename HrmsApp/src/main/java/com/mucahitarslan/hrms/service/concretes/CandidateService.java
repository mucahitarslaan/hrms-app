package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.ICandidateRepository;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.CandidateEntity;
import com.mucahitarslan.hrms.dto.request.CandidateRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.entity.concretes.Candidate;
import com.mucahitarslan.hrms.mapper.ICandidateMapper;
import com.mucahitarslan.hrms.service.abstracts.ICandidateService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService implements ICandidateService {
    private final ICandidateRepository candidateRepository;
    private final ICandidateMapper candidateMapper;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationService authenticationService;
    private final CandidateEntity candidateEntity;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    public CandidateService(ICandidateRepository candidateRepository, ICandidateMapper candidateMapper,
                            PasswordEncoder passwordEncoder, AuthenticationService authenticationService, CandidateEntity candidateEntity, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.candidateRepository = candidateRepository;
        this.candidateMapper = candidateMapper;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
        this.candidateEntity = candidateEntity;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate save(CandidateRequest candidateRequest) {
        if (candidateRequest.getPassword().equals(candidateRequest.getRepassword())){
            candidateRequest.setPassword(passwordEncoder.encode(candidateRequest.getPassword()));
            var candidatedb = candidateEntity.toCandidate(candidateRequest);
            candidateRepository.save(candidatedb);

            var jwtToken = jwtService.generateToken(candidatedb);
            var authresponse = new AuthenticationResponse();
            authresponse.setToken(jwtToken);
            System.out.println(authresponse);
            return candidatedb;
        }
        else
            return new Candidate();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        return authenticationService.authenticate(authenticationRequest);
    }
}
