package com.example.graphicslibrariesbackend.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class VideoGameErrorValueDto {
    private String code;
    private String message;
}
