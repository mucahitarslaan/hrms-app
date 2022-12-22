package com.mucahitarslan.hrms.mapper;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.entity.concretes.Employer;
import org.mapstruct.Mapper;

@Mapper(implementationName = "EmployerMapperImpl", componentModel = "spring")
public interface IEmployerMapper {
    Employer toEmployer(EmployerResponse employerResponse);
    EmployerResponse toEmployerResponse(Employer employer);

    Employer toEmployer(EmployerRequest employerRequest);
}
