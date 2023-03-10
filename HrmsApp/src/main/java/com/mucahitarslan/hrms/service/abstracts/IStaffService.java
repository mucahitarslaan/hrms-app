package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.dto.request.AuthenticationRequest;
import com.mucahitarslan.hrms.dto.request.StaffRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.entity.concretes.Staff;

import java.util.List;

public interface IStaffService {

    List<Staff> getAll();

    Staff save(StaffRequest staffRequest);

    AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest);
}
