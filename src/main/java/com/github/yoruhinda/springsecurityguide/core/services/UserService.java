package com.github.yoruhinda.springsecurityguide.core.services;

import com.github.yoruhinda.springsecurityguide.core.domain.dto.UserDto;
import com.github.yoruhinda.springsecurityguide.core.domain.entity.User;
import com.github.yoruhinda.springsecurityguide.core.domain.enumerated.UserRoleEnumerated;
import com.github.yoruhinda.springsecurityguide.core.exceptions.InvalidUserException;
import com.github.yoruhinda.springsecurityguide.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    public User registerUserInDatabase(UserDto userDto) {
        if (loadUserByUsername(userDto.username()) != null) throw new InvalidUserException("User Already exist");
        User user = new User(userDto.username(), passwordEncoder.encode(userDto.password()));
        user.setUserRole(UserRoleEnumerated.USER);
        userRepository.save(user);
        return user;
    }

    public User deleteUser(long id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
        return user;
    }
}
