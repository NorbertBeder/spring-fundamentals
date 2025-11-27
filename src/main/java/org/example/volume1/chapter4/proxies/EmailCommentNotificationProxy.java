package org.example.volume1.chapter4.proxies;

import org.example.volume1.chapter4.model.Comment4;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment4 comment4) {
        System.out.println("Sending notification for comment: " + comment4.getText());
    }
}
