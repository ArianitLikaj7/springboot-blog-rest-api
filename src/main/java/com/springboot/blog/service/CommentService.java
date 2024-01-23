package com.springboot.blog.service;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;

import java.util.List;
import java.util.concurrent.CompletionException;

public interface CommentService {
    CommentDto createPost(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long id);
    CommentDto getCommentById(Long postId, Long commentId);
    CommentDto updateComment(Long postId, Long commentId, CommentDto commentRequest);
    void deleteComment(Long postId, Long commentId);
}
