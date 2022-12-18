package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.dto.response.RecordEmployerResponse;

import java.util.List;

public interface IEmployerService {
    List<RecordEmployerResponse> findAll();
    EmployerResponse save(EmployerRequest employerRequest);
}
