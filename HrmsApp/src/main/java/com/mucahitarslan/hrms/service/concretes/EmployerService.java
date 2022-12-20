package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IEmployerRepository;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.mapper.IEmployerMapper;
import com.mucahitarslan.hrms.service.abstracts.IEmployerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service()
public class EmployerService implements IEmployerService {
    private final IEmployerRepository employerRepository;
    private final IEmployerMapper employerMapper;

    public EmployerService(IEmployerRepository employerRepository, IEmployerMapper employerMapper) {
        this.employerRepository = employerRepository;
        this.employerMapper = employerMapper;
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
        var employer = employerMapper.toEmployer(employerRequest);
        return new SuccessDataResult<>(employerMapper.toEmployerResponse(employerRepository.save(employer)),"Employer is added");
    }
}
