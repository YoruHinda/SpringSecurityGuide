package com.github.yoruhinda.springsecurityguide.core.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidUserException extends BaseException{
    public InvalidUserException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
