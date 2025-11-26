package org.example.volume1.chapter4.ex6.proxy;

import org.example.volume1.chapter4.model.Comment4;
import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy6 implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment4 comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
