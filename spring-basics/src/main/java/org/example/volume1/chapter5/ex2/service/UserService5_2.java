package org.example.volume1.chapter5.ex2.service;

import org.example.volume1.chapter5.ex2.repository.CommentRepository5_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService5_2 {

    @Autowired
    private CommentRepository5_2 commentRepository;

    public CommentRepository5_2 getCommentRepository() {
        return commentRepository;
    }
}
