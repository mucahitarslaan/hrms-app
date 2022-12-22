package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.configuration.IValidatePersonService;
import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.ErrorDataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IJobSeekerRepository;
import com.mucahitarslan.hrms.dto.request.JobSeekerRequest;
import com.mucahitarslan.hrms.dto.response.JobSeekerResponse;
import com.mucahitarslan.hrms.mapper.IJobSeekerMapper;
import com.mucahitarslan.hrms.service.abstracts.IJobSeekerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobSeekerService implements IJobSeekerService {
    private final IJobSeekerRepository jobSeekerRepository;
    private final IJobSeekerMapper jobSeekerMapper;
    private final IValidatePersonService validatePersonService;

    public JobSeekerService(IJobSeekerRepository jobSeekerRepository, IJobSeekerMapper jobSeekerMapper,
                            @Qualifier("validatePersonService") IValidatePersonService validatePersonService) {
        this.jobSeekerRepository = jobSeekerRepository;
        this.jobSeekerMapper = jobSeekerMapper;
        this.validatePersonService = validatePersonService;
    }

    @Override
    public DataResult<List<JobSeekerResponse>> findAll() {
        return new SuccessDataResult<>(jobSeekerRepository.findAll()
                .stream()
                .map(jobSeekerMapper::toJobSeekerResponse)
                .collect(Collectors.toList()),"All job seekers are listed");
    }

    @Override
    public DataResult<JobSeekerResponse> save(JobSeekerRequest jobSeekerRequest) {
       /* if (jobSeekerRepository.existsByMail(jobSeekerRequest.mail())){
            return new ErrorDataResult<>("the mail has been used before");
        }
        if (jobSeekerRepository.existsByIdentityId(jobSeekerRequest.identityId())){
            return new ErrorDataResult<>("the identity id has been used before");
        }*/
        if (validatePersonService.validate(jobSeekerRequest)){
            var jobSeeker = jobSeekerMapper.toJobSeeker(jobSeekerRequest);
            return new SuccessDataResult<>(jobSeekerMapper.toJobSeekerResponse(jobSeekerRepository.save(jobSeeker)),"Job seeker is added");
        }
            return new ErrorDataResult<>("check identity id");
    }
}
