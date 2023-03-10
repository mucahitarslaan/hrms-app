package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IStaffRepository;
import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.StaffEntity;
import com.mucahitarslan.hrms.dto.request.StaffRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import com.mucahitarslan.hrms.service.abstracts.IStaffService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {
    private final IStaffRepository staffRepository;

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationService authenticationService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final StaffEntity staffEntity;

    public StaffService(IStaffRepository staffRepository, PasswordEncoder passwordEncoder,
                        AuthenticationService authenticationService, JwtService jwtService,
                        AuthenticationManager authenticationManager, StaffEntity staffEntity) {
        this.staffRepository = staffRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationService = authenticationService;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.staffEntity = staffEntity;
    }

    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }

    @Override
    public Staff save(StaffRequest staffRequest) {
        if (staffRequest.getPassword().equals(staffRequest.getRepassword())){
            staffRequest.setPassword(passwordEncoder.encode(staffRequest.getPassword()));
            var staffdb = staffEntity.toStaff(staffRequest);
            staffRepository.save(staffdb);

            var jwtToken = jwtService.generateToken(staffdb);
            var authresponse = new AuthenticationResponse();
            authresponse.setToken(jwtToken);
            System.out.println(authresponse);
            return staffdb;
        }
        else
            return new Staff();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        return authenticationService.authenticate(authenticationRequest);
    }
}
