package com.example.graphicslibrariesbackend.configuration;

import org.modelmapper.*;
import org.modelmapper.convention.*;
import org.springframework.context.annotation.*;

@Configuration
public class MappingConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        var mapper = new ModelMapper();

        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);

        return mapper;
    }
}
