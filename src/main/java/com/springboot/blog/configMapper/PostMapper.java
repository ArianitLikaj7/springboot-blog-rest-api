package com.springboot.blog.configMapper;

import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    private final ModelMapper mapper;

    public PostMapper(ModelMapper mapper){
        this.mapper = mapper;
    }
    public PostDto mapToDto(Post post) {
        return mapper.map(post, PostDto.class);
    }

    public Post mapToEntity(PostDto postDto) {
        return mapper.map(postDto, Post.class);
    }

}
