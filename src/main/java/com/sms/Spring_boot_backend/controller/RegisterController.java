package com.sms.Spring_boot_backend.controller;

import com.sms.Spring_boot_backend.entity.Users;
import com.sms.Spring_boot_backend.service.UserService;
import com.sms.Spring_boot_backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class RegisterController {

    @GetMapping("/register")
    public String registerController(){
        return "Hello Worlds";
    }

    @Autowired
    private UserService userService;
    @PostMapping("/v1/user-register")
    public Users saveUser(@RequestBody Users users){
        return userService.saveUser(users);
    }
}
