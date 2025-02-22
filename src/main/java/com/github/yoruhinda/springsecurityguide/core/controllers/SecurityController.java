package com.github.yoruhinda.springsecurityguide.core.controllers;

import com.github.yoruhinda.springsecurityguide.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity login(String username, String password){
        return null;
    }

    @PostMapping
    public ResponseEntity register(String username, String password){
        return null;
    }
}
