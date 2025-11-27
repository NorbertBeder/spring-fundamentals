package org.example.volume1.chapter6.ex4;

import org.example.volume1.chapter6.ex4.config.ProjectConfig6_4;
import org.example.volume1.chapter6.ex4.services.CommentService6_4;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig6_4.class);

        var service = c.getBean(CommentService6_4.class);

        Comment6 comment =  new Comment6();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
        service.deleteComment(comment);
        service.editComment(comment);
    }
}
