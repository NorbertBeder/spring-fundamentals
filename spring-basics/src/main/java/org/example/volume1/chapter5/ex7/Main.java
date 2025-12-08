package org.example.volume1.chapter5.ex7;

import org.example.volume1.chapter5.ex7.config.ProjectConfig5_7;
import org.example.volume1.chapter5.ex7.model.Comment7;
import org.example.volume1.chapter5.ex7.service.CommentService5_7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_7.class);

        var commentService = c.getBean(CommentService5_7.class);

        commentService.sendComment(new Comment7());
        commentService.sendComment(new Comment7());
    }
}
