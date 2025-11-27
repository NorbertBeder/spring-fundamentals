package org.example.volume1.chapter6.ex1;

import org.example.volume1.chapter6.ex1.config.ProjectConfig6_1;
import org.example.volume1.chapter6.ex1.services.CommentService6_1;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig6_1.class);

        var service = c.getBean(CommentService6_1.class);

        Comment6 comment =  new Comment6();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }
}
