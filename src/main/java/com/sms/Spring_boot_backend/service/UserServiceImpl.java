package com.sms.Spring_boot_backend.service;

import com.sms.Spring_boot_backend.entity.Users;
import com.sms.Spring_boot_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public Users saveUser(Users users) {
        return userRepository.save(users);
    }
}
