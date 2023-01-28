package com.mucahitarslan.hrms.service.concretes;

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
    public UserActivation add(UserActivation userActivation) {
        return userActivationRepository.save(userActivation);
    }

    @Override
    public List<UserActivation> getAll() {
        return userActivationRepository.findAll();
    }
}
