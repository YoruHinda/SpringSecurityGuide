package com.github.yoruhinda.springsecurityguide.core.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class BaseException extends RuntimeException{
    private final HttpStatus statusCode;

    public BaseException(final String message, final HttpStatus statusCode){
        super(message);
        this.statusCode = statusCode;
    }
}
