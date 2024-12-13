package com.sms.Spring_boot_backend.service.users;

import com.sms.Spring_boot_backend.entity.users.Users;
import com.sms.Spring_boot_backend.repository.users.UserRepo;
import com.sms.Spring_boot_backend.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UsersService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public Users registerUser(Users user){
        user.setCreatedAt(new Date());
        try {
            Users savedUser = userRepo.save(user);
            return new ApiResponse<>("User registered successfully", savedUser).getData();
        }catch (Exception error){
            throw new RuntimeException("Error registering user" + error.getMessage(), error);
        }
    }

}