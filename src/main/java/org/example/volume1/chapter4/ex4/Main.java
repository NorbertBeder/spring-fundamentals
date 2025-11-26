package org.example.volume1.chapter4.ex4;

import org.example.volume1.chapter4.ex4.config.ProjectConfiguration4_4;
import org.example.volume1.chapter4.model.Comment;
import org.example.volume1.chapter4.services.CommentService;
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
