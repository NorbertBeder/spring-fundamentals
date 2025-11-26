package org.example.volume1.chapter6.ex2;

import org.example.volume1.chapter6.ex2.config.ProjectConfig6_2;
import org.example.volume1.chapter6.ex2.services.CommentService6_2;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig6_2.class);

        var service = c.getBean(CommentService6_2.class);

        Comment6 comment =  new Comment6();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}
