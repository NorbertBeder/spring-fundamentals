package org.example.volume1.chapter4.ex2;

import org.example.volume1.chapter4.ex2.config.ProjectConfiguration4_2;
import org.example.volume1.chapter4.ex2.service.CommentService2;
import org.example.volume1.chapter4.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_2.class);

        var comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Laurentiu");

        var commentService = context.getBean(CommentService2.class);
        commentService.publishComment(comment);
    }
}
