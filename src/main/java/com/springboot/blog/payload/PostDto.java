package com.springboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 2, message = "The title should have at least 2 character")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Description should have at least 10 character")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
