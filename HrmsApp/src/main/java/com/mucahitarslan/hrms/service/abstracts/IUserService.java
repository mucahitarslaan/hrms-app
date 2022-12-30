package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.User;

import java.util.List;

public interface IUserService {
    DataResult<List<User>> getAll();
}
