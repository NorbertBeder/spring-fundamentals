package org.example.volume1.chapter5.ex2.service;

import org.example.volume1.chapter5.ex2.repository.CommentRepository5_2;
import org.springframework.stereotype.Service;

@Service
public class CommentService5_2 {

//    @Autowired
//    private CommentRepository5_2 commentRepository;
//
//    public CommentRepository5_2 getCommentRepository() {
//        return commentRepository;
//    }

    private final CommentRepository5_2 commentRepository;

    public CommentService5_2(CommentRepository5_2 commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository5_2 getCommentRepository() {
        return commentRepository;
    }
}
