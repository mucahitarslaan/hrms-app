package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IEmployerRepository;
import com.mucahitarslan.hrms.dto.request.EmployerRequest;
import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import com.mucahitarslan.hrms.mapper.IEmployerMapper;
import com.mucahitarslan.hrms.service.abstracts.IEmployerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class EmployerService implements IEmployerService {
    private final IEmployerRepository employerRepository;
    private final IEmployerMapper employerMapper;

    public EmployerService(IEmployerRepository employerRepository, IEmployerMapper employerMapper) {
        this.employerRepository = employerRepository;
        this.employerMapper = employerMapper;
    }

    @Override
    public List<EmployerResponse> findAll() {
        return employerRepository.findAll()
                .stream()
                .map(employerMapper::toEmployerResponse)
                .toList();
    }

    @Override
    public EmployerResponse save(EmployerRequest employerRequest) {
        var employer = employerMapper.toEmployer(employerRequest);
        return employerMapper.toEmployerResponse(employerRepository.save(employer));
    }
}
