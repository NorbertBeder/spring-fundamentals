package org.example.volume1.chapter4.ex5;

import org.example.volume1.chapter4.ex5.config.ProjectConfiguration4_5;
import org.example.volume1.chapter4.model.Comment;
import org.example.volume1.chapter4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_5.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("This is a comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
