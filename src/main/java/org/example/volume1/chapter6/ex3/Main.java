package org.example.volume1.chapter6.ex3;

import org.example.volume1.chapter6.ex3.config.ProjectConfig6_3;
import org.example.volume1.chapter6.ex3.services.CommentService6_3;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(org.example.volume1.chapter6.ex3.Main.class.getName());

    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig6_3.class);

        var service = c.getBean(CommentService6_3.class);

        Comment6 comment =  new Comment6();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}