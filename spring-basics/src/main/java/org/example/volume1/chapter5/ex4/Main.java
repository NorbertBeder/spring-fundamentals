package org.example.volume1.chapter5.ex4;

import org.example.volume1.chapter5.ex4.config.ProjectConfig5_4;
import org.example.volume1.chapter5.ex4.service.CommentService5_4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_4.class);

        System.out.println("Before retrieving the CommentService");
        var service = c.getBean(CommentService5_4.class);
        System.out.println("After retrieving the CommentService");
    }
}
