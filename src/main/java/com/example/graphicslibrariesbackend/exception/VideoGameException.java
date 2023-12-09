package com.example.graphicslibrariesbackend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class VideoGameException extends RuntimeException {
    private final HttpStatus httpStatus;
    private final String errorCode;

    public VideoGameException(HttpStatus httpStatus, String errorCode, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }
}
