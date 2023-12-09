package com.example.graphicslibrariesbackend.exception;

import org.springframework.http.HttpStatus;

public class VideoGameNotFoundException extends VideoGameException {

    public VideoGameNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, "5001", message);
    }
}
