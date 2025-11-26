package org.example.volume1.chapter4.ex5.proxy;

import org.example.volume1.chapter4.model.Comment;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CommentPushNotificationProxy5 implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
