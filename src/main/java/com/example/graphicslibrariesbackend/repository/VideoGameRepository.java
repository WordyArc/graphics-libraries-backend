package com.example.graphicslibrariesbackend.repository;


import com.example.graphicslibrariesbackend.model.VideoGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoGameRepository extends CrudRepository<VideoGame, Long> {

    List<VideoGame> findAll();
}
