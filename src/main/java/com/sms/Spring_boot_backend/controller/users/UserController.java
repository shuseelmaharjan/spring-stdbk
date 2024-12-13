package com.sms.Spring_boot_backend.controller.users;

import com.sms.Spring_boot_backend.entity.users.Users;
import com.sms.Spring_boot_backend.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/v1/register-user")
    public Users registerUser(@RequestBody Users users){
        return usersService.registerUser(users);
    }

}
