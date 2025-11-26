package org.example.volume1.chapter4.ex1.repositories;

import org.example.volume1.chapter4.model.Comment4;

public class DBCommentRepositoryEx1 implements CommentRepositoryEx1 {

    @Override
    public void storeComment(Comment4 comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
