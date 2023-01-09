package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.ErrorDataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IEmployerRepository;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.EmployerEntity;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.entity.concretes.Employer;
import com.mucahitarslan.hrms.mapper.IEmployerMapper;
import com.mucahitarslan.hrms.service.abstracts.IEmployerService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployerService implements IEmployerService {
    private final IEmployerRepository employerRepository;
    private final IEmployerMapper employerMapper;

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationService authenticationService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final EmployerEntity employerEntity;

    public EmployerService(IEmployerRepository employerRepository, IEmployerMapper employerMapper,
                           PasswordEncoder passwordEncoder, AuthenticationService authenticationService,
                           JwtService jwtService, AuthenticationManager authenticationManager, EmployerEntity employerEntity) {
        this.employerRepository = employerRepository;
        this.employerMapper = employerMapper;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.employerEntity = employerEntity;
    }

    @Override
    public DataResult<List<EmployerResponse>> findAll() {
        return new SuccessDataResult<>(employerRepository.findAll()
                .stream()
                .map(employerMapper::toEmployerResponse)
                .collect(Collectors.toList()),"All employers are listed");
    }

    @Override
    public DataResult<EmployerResponse> save(EmployerRequest employerRequest) {
        if (employerRequest.getPassword().equals(employerRequest.getRePassword())){
            employerRequest.setPassword(passwordEncoder.encode(employerRequest.getPassword()));
            var employerdb = employerEntity.toEmployer(employerRequest);
            employerRepository.save(employerdb);

            var jwtToken = jwtService.generateToken(employerdb);
            var authresponse = new AuthenticationResponse();
            authresponse.setToken(jwtToken);
            System.out.println(authresponse);
            return new SuccessDataResult<>("The employer is saved");
        }
        else
            return new ErrorDataResult<>("Password must be same");
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest){
        return authenticationService.authenticate(authenticationRequest);
    }
}
