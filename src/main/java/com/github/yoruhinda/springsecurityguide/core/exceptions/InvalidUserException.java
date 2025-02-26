package com.github.yoruhinda.springsecurityguide.core.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidUserException extends BaseException{
    // Invalid User Exception for error in services or other class
    public InvalidUserException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
