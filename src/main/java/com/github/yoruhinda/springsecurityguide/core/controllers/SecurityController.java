package com.github.yoruhinda.springsecurityguide.core.controllers;

import com.github.yoruhinda.springsecurityguide.core.domain.dto.UserDto;
import com.github.yoruhinda.springsecurityguide.core.domain.entity.User;
import com.github.yoruhinda.springsecurityguide.core.exceptions.InvalidUserException;
import com.github.yoruhinda.springsecurityguide.core.security.JwtGenerator;
import com.github.yoruhinda.springsecurityguide.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class SecurityController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtGenerator jwtGenerator;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto userDto){
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDto.username(), userDto.password()));
        User user = (User) authenticate.getPrincipal();
        String token = jwtGenerator.generateToken(user);
        return ResponseEntity.ok("User: " + SecurityContextHolder.getContext().getAuthentication() + " Authenticated! Token: " + token);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDto userDto){
        User user = userService.registerUserInDatabase(userDto);
        return ResponseEntity.ok("User Created >> " + user);
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long id){
        User user = userService.deleteUser(id);
        return ResponseEntity.ok("User: " + user + " deleted!");
    }
}
