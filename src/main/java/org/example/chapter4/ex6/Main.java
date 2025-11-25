package org.example.chapter4.ex6;

import org.example.chapter4.ex6.config.ProjectConfiguration4_6;
import org.example.chapter4.ex6.service.CommentService6;
import org.example.chapter4.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_6.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("This is a comment");

        var commentService = context.getBean(CommentService6.class);
        commentService.publishComment(comment);
    }
}
