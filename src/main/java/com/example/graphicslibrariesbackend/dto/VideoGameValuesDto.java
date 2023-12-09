package com.example.graphicslibrariesbackend.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class VideoGameValuesDto {

    private List<VideoGameValueDto> games;
}
