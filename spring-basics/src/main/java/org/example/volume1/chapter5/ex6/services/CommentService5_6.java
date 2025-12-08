package org.example.volume1.chapter5.ex6.services;

import org.example.volume1.chapter5.ex6.repository.CommentRepository5_6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService5_6 {

    @Autowired
    private CommentRepository5_6 commentRepository;

    public CommentRepository5_6 getCommentRepository() {
        return commentRepository;
    }
}
