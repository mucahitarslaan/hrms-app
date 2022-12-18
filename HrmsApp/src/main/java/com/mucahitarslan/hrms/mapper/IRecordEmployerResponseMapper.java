package com.mucahitarslan.hrms.mapper;

import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.dto.response.RecordEmployerResponse;
import com.mucahitarslan.hrms.entity.concretes.Employer;
import org.mapstruct.Mapper;

@Mapper(implementationName = "IRecordEmployerResponseMapperImpl", componentModel = "spring")
public interface IRecordEmployerResponseMapper {

    RecordEmployerResponse toRecordEmployerResponse(Employer employer);

}
