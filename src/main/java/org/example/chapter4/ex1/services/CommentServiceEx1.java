package org.example.chapter4.ex1.services;

import org.example.chapter4.model.Comment;
import org.example.chapter4.ex1.proxies.CommentNotificationProxyEx1;
import org.example.chapter4.ex1.repositories.CommentRepositoryEx1;

public class CommentServiceEx1 {
    private final CommentRepositoryEx1 commentRepository;
    private final CommentNotificationProxyEx1 commentNotificationProxy;


    public CommentServiceEx1(CommentRepositoryEx1 commentRepository, CommentNotificationProxyEx1 commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
