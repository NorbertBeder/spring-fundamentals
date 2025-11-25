package org.example.chapter4.ex1;

import org.example.chapter4.ex1.services.CommentServiceEx1;
import org.example.chapter4.model.Comment;
import org.example.chapter4.ex1.proxies.EmailCommentNotificationProxyEx1;
import org.example.chapter4.ex1.repositories.DBCommentRepositoryEx1;

public class Main {
    static void main() {
        var commentRepository = new DBCommentRepositoryEx1();

        var commentNotificationProxy = new EmailCommentNotificationProxyEx1();

        var commentService = new CommentServiceEx1(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
