package org.example.volume1.chapter4.ex3.service;

import org.example.volume1.chapter4.model.Comment;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.example.volume1.chapter4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService3 {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment){
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
