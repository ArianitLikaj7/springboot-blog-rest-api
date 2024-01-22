package com.springboot.blog.service;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createPost(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long id);
}
