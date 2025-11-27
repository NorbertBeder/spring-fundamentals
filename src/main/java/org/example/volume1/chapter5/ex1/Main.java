package org.example.volume1.chapter5.ex1;

import org.example.volume1.chapter5.ex1.services.CommentService5_1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(CommentService5_1.class);

        var cs1 = c.getBean("commentService5_1", CommentService5_1.class);
        var cs2 = c.getBean("commentService5_1", CommentService5_1.class);
        boolean b1 = cs1 == cs2;

        System.out.println(b1);
    }
}
