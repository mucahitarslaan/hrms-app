package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
}
