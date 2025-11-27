package org.example.volume1.chapter5.ex5;

import org.example.volume1.chapter5.ex5.config.ProjectConfig5_5;
import org.example.volume1.chapter5.ex5.services.CommentService5_5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_5.class);

        var cs1 = c.getBean("commentService5_5", CommentService5_5.class);
        var cs2=  c.getBean("commentService5_5", CommentService5_5.class);

        boolean b1 = cs1 == cs2;

        System.out.println(b1);
    }
}
