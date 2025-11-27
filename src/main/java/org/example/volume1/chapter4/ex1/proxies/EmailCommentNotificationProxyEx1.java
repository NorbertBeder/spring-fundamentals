package org.example.volume1.chapter4.ex1.proxies;

import org.example.volume1.chapter4.model.Comment4;

public class EmailCommentNotificationProxyEx1 implements CommentNotificationProxyEx1 {

    @Override
    public void sendComment(Comment4 comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
