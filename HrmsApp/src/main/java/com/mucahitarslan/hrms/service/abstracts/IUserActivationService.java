package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.UserActivation;

import java.util.List;

public interface IUserActivationService {
    DataResult<UserActivation> add(UserActivation userActivation);

    DataResult<List<UserActivation>> getAll();
}
