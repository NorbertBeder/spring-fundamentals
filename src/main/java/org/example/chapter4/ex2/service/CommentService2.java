package org.example.chapter4.ex2.service;

import org.example.chapter4.model.Comment;
import org.example.chapter4.proxies.CommentNotificationProxy;
import org.example.chapter4.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService2 {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService2(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
