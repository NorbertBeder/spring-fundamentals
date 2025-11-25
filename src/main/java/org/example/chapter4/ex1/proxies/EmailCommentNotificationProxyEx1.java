package org.example.chapter4.ex1.proxies;

import org.example.chapter4.model.Comment;

public class EmailCommentNotificationProxyEx1 implements CommentNotificationProxyEx1 {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
