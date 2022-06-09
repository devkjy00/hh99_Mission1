package com.jy.mission1.controller;

import com.jy.mission1.dto.CommentDto;
import com.jy.mission1.model.Comment;
import com.jy.mission1.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;


    @GetMapping("/comments/{boardId}")
    public List<Comment> findComments(@PathVariable long boardId){
        return commentService.findComments(boardId);
    }


    @PostMapping("/comments")
    public Comment createComment(@RequestBody CommentDto commentDto){
        return commentService.createComment(commentDto);
    }


    @PutMapping("/comments/{id}")
    public Comment updateComment(@PathVariable long id, @RequestBody CommentDto commentDto){
        return commentService.updateComment(id, commentDto);
    }


    @DeleteMapping("/comments/{id}")
    public long deleteComment(@PathVariable long id){
        return commentService.deleteComment(id);
    }
}
