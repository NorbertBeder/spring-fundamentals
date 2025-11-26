package org.example.volume1.chapter4.proxies;

import org.example.volume1.chapter4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
