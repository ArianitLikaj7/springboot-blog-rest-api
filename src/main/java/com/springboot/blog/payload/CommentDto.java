package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
public class CommentDto {
    private Long id;
    @NotEmpty(message = "name should not be empty")
    private String name;

    @NotEmpty(message = "Email should be null or empty")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Sholud not be under 10 character")
    private String body;
}
