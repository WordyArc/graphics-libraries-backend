package com.example.graphicslibrariesbackend.exception;

import org.springframework.http.HttpStatus;

public class VideoGameEmptyRequestException extends VideoGameException {

    public VideoGameEmptyRequestException(String message) {
        super(HttpStatus.BAD_REQUEST, "5000", message);
    }
}
