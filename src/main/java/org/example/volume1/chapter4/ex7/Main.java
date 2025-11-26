package org.example.volume1.chapter4.ex7;

import org.example.volume1.chapter4.ex7.config.ProjectConfiguration4_7;
import org.example.volume1.chapter4.ex7.services.CommentService7;
import org.example.volume1.chapter4.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration4_7.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("This is a comment");

        var commentService = context.getBean(CommentService7.class);
        commentService.publishComment(comment);
    }
}
