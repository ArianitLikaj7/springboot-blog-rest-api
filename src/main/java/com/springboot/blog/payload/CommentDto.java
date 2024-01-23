package com.springboot.blog.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String body;
}
