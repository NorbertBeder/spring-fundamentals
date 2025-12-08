package org.example.volume1.chapter4.ex7.services;

import org.example.volume1.chapter4.ex7.repositories.CommentRepository7;
import org.example.volume1.chapter4.model.Comment4;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.springframework.stereotype.Service;

@Service
public class CommentService7 {

    private final CommentRepository7 commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService7(CommentRepository7 commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment4 comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
