package com.example.graphicslibrariesbackend.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Builder
@Entity(name = "video_game")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String genre;

    @Min(1)
    private int releaseDate;

    @NotBlank
    private String developer;

    @NotBlank
    private String publisher;
}
