package org.example.chapter4.ex6.proxy;

import org.example.chapter4.model.Comment;
import org.example.chapter4.proxies.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy6 implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
