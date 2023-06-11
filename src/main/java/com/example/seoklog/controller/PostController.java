package com.example.seoklog.controller;

import com.example.seoklog.controller.dto.CreateRequestDto;
import com.example.seoklog.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class PostController {
    private final PostService postService;
    @PostMapping("/post")
    public Long createPost(@RequestBody CreateRequestDto createRequestDto) {
        return postService.createPost(createRequestDto);
    }

}