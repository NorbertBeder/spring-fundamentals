package org.example.volume1.chapter4.ex3;

import org.example.volume1.chapter4.ex3.config.ProjectConfiguration4_3;
import org.example.volume1.chapter4.ex3.service.CommentService3;
import org.example.volume1.chapter4.model.Comment4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_3.class);

        var comment = new Comment4();
        comment.setText("Demo comment");
        comment.setAuthor("Laurentiu");

        var commentService = context.getBean(CommentService3.class);
        commentService.publishComment(comment);
    }
}
