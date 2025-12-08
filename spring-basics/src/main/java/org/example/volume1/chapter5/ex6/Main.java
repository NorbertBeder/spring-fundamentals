package org.example.volume1.chapter5.ex6;

import org.example.volume1.chapter5.ex6.config.ProjectConfig5_6;
import org.example.volume1.chapter5.ex6.services.CommentService5_6;
import org.example.volume1.chapter5.ex6.services.UserService5_6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_6.class);

        var s1 = c.getBean(CommentService5_6.class);
        var s2 = c.getBean(UserService5_6.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}
