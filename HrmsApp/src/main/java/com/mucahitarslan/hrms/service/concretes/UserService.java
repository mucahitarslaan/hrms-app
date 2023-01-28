package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IUserRepository;
import com.mucahitarslan.hrms.entity.concretes.User;
import com.mucahitarslan.hrms.service.abstracts.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
