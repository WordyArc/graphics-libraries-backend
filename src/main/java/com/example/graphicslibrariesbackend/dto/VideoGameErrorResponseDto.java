package com.example.graphicslibrariesbackend.dto;

import lombok.*;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class VideoGameErrorResponseDto {

    private VideoGameErrorValueDto error;
}
