package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IUserActivationRepository;
import com.mucahitarslan.hrms.entity.concretes.UserActivation;
import com.mucahitarslan.hrms.service.abstracts.IUserActivationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivationService implements IUserActivationService {
    private final IUserActivationRepository userActivationRepository;

    public UserActivationService(IUserActivationRepository userActivationRepository) {
        this.userActivationRepository = userActivationRepository;
    }

    @Override
    public DataResult<UserActivation> add(UserActivation userActivation) {
        return new SuccessDataResult<>(userActivationRepository.save(userActivation),"The user activation is saved successfully");
    }

    @Override
    public DataResult<List<UserActivation>> getAll() {
        return new SuccessDataResult<>(userActivationRepository.findAll(),"The user activations are listed");
    }
}
