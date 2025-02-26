package com.github.yoruhinda.springsecurityguide.core.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class BaseException extends RuntimeException{
    //Base Exception what will it be implemented in factual exception!
    private final HttpStatus statusCode;

    public BaseException(final String message, final HttpStatus statusCode){
        super(message);
        this.statusCode = statusCode;
    }
}
