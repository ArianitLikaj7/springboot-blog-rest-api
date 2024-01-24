package com.springboot.blog.payload;

import lombok.*;

@Getter
@Setter
public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String body;
}
