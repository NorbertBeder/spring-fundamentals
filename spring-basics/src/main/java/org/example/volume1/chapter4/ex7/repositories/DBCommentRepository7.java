package org.example.volume1.chapter4.ex7.repositories;

import org.example.volume1.chapter4.model.Comment4;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository7 implements CommentRepository7 {

    @Override
    public void storeComment(Comment4 comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
