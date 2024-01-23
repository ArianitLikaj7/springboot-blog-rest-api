package com.springboot.blog.configMapper;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    private final ModelMapper mapper;

    public CommentMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public CommentDto mapToDto(Comment comment){
        return mapper.map(comment,CommentDto.class);
    }

    public Comment mapToEntity(CommentDto commentDto){
        return mapper.map(commentDto, Comment.class);
    }
}
