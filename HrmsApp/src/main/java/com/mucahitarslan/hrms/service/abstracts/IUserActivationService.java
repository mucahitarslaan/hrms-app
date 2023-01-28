package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.UserActivation;

import java.util.List;

public interface IUserActivationService {
    UserActivation add(UserActivation userActivation);

    List<UserActivation> getAll();
}
