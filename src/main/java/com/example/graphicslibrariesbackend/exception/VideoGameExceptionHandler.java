package com.example.graphicslibrariesbackend.exception;

import com.example.graphicslibrariesbackend.dto.VideoGameErrorResponseDto;
import com.example.graphicslibrariesbackend.dto.VideoGameErrorValueDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class VideoGameExceptionHandler {

    public ResponseEntity<VideoGameErrorResponseDto> handleCreationException(VideoGameException exception) {
        var error = VideoGameErrorValueDto.builder()
                .code(exception.getErrorCode())
                .message(exception.getMessage())
                .build();

        var result = new VideoGameErrorResponseDto()
                .setError(error);

        return  ResponseEntity
                .status(exception.getHttpStatus())
                .body(result);
    }
}
