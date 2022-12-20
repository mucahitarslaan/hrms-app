package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;

import java.util.List;

public interface IEmployerService {
    DataResult<List<EmployerResponse>> findAll();
    DataResult<EmployerResponse> save(EmployerRequest employerRequest);
}
