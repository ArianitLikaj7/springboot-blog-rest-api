package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping("/{postId}")
    public ResponseEntity<CommentDto> creatComment(@PathVariable(name = "postId") long postId,
                                                   @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.createPost(postId,commentDto), HttpStatus.CREATED);
    }

    @GetMapping("/{postId}/byPostId")
    public ResponseEntity<List<CommentDto>>getCommentByPostId(@PathVariable Long postId){
        return new ResponseEntity<>(commentService.getCommentsByPostId(postId),HttpStatus.OK);
    }
}
