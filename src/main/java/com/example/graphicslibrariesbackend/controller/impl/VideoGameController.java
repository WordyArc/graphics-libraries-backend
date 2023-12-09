package com.example.graphicslibrariesbackend.controller.impl;


import com.example.graphicslibrariesbackend.controller.VideoGameEndpoint;
import com.example.graphicslibrariesbackend.dto.VideoGameValueDto;
import com.example.graphicslibrariesbackend.dto.VideoGameValuesDto;
import com.example.graphicslibrariesbackend.service.VideoGameService;
import lombok.*;

import org.modelmapper.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/video-game-service")
public class VideoGameController implements VideoGameEndpoint {

    private final VideoGameService service;
    private final ModelMapper mapper;

    @Override
    @GetMapping("/video-games")
    public VideoGameValuesDto getVideoGames() {

        var videoGames = service.getVideoGames();

        var data = videoGames.stream()
                .map(game -> mapper.map(game, VideoGameValueDto.class))
                .toList();

        return new VideoGameValuesDto().setGames(data);
    }
}
