package org.example.chapter4.ex7.repositories;

import org.example.chapter4.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository7 implements CommentRepository7 {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
