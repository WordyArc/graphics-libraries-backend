package com.example.graphicslibrariesbackend.dto;

import lombok.Getter;

@Getter
public class VideoGameValueDto {
    private long id;
    private String title;
    private String genre;
    private int releaseDate;
    private String developer;
    private String publisher;
}
