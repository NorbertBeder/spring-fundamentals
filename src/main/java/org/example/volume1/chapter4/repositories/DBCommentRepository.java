package org.example.volume1.chapter4.repositories;

import org.example.volume1.chapter4.model.Comment4;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment4 comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
