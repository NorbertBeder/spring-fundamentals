package org.example.chapter4.ex4;

import org.example.chapter4.ex4.config.ProjectConfiguration4_4;
import org.example.chapter4.model.Comment;
import org.example.chapter4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_4.class);

        var comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Laurentiu");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
