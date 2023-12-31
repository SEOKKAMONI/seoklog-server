package com.example.seoklog.controller.dto;

import com.example.seoklog.domain.Post;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private Date date;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.date = post.getDate();
    }
}
