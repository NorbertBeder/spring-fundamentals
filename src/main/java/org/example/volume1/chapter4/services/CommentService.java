package org.example.volume1.chapter4.services;

import org.example.volume1.chapter4.model.Comment4;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.example.volume1.chapter4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment4 comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
