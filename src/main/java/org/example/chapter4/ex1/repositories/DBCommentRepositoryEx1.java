package org.example.chapter4.ex1.repositories;

import org.example.chapter4.model.Comment;

public class DBCommentRepositoryEx1 implements CommentRepositoryEx1 {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
