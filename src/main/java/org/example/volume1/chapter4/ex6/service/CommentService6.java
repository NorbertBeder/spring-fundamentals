package org.example.volume1.chapter4.ex6.service;

import org.example.volume1.chapter4.model.Comment;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.example.volume1.chapter4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService6 {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService6(CommentRepository commentRepository,
                           @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
