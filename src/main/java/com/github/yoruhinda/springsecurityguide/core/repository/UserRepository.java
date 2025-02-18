package com.github.yoruhinda.springsecurityguide.core.repository;

import com.github.yoruhinda.springsecurityguide.core.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
