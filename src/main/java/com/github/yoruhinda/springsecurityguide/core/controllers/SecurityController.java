package com.github.yoruhinda.springsecurityguide.core.controllers;

import com.github.yoruhinda.springsecurityguide.core.domain.dto.UserDto;
import com.github.yoruhinda.springsecurityguide.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class SecurityController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(UserDto userDto){
        return null;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(UserDto userDto){
        if(userService.loadUserByUsername(userDto.username()) != null);
        return null;
    }
}
