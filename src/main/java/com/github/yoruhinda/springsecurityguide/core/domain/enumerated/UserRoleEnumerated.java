package com.github.yoruhinda.springsecurityguide.core.domain.enumerated;

public enum UserRoleEnumerated {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRoleEnumerated(String role) {
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}
