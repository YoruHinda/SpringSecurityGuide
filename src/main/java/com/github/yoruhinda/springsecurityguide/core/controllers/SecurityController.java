package com.github.yoruhinda.springsecurityguide.core.controllers;

import com.github.yoruhinda.springsecurityguide.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityController {
    @Autowired
    private UserService userService;

    public void login(){

    }

    public void register(){

    }
}
