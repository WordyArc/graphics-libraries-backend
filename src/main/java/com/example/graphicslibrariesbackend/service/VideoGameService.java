package com.example.graphicslibrariesbackend.service;

import com.example.graphicslibrariesbackend.model.*;
import com.example.graphicslibrariesbackend.repository.*;
import org.springframework.stereotype.*;

import lombok.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoGameService {

    private final VideoGameRepository repository;

    public List<VideoGame> getVideoGames() {
        return repository.findAll();
    }
}
