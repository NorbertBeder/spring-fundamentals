package org.example.volume1.chapter5.ex2;

import org.example.volume1.chapter5.ex2.config.ProjectConfig5_2;
import org.example.volume1.chapter5.ex2.service.CommentService5_2;
import org.example.volume1.chapter5.ex2.service.UserService5_2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_2.class);

        var s1 = c.getBean(CommentService5_2.class);
        var s2 = c.getBean(UserService5_2.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}
