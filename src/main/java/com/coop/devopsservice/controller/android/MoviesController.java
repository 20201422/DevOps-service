/**
 * @ClassName MoviesController
 * @Author 24
 * @Date 2023/5/30 22:01
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller.android;


import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.util.ApiResultHandler;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("movies")
public class MoviesController {

    private final ObjectMapper objectMapper;

    public MoviesController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @GetMapping("/")
    public ApiResult<?> findMovies() throws IOException {
        ClassPathResource resource = new ClassPathResource("movies.json");

        return  ApiResultHandler.success(objectMapper
                .readValue(resource.getInputStream(), new TypeReference<List<Movie>>() {}));
    }
}


//    may the force be with you.
//    @ClassName   MoviesController
//    Created by 24 on 2023/5/30.
