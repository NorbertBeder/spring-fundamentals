package org.example.chapter2.ex7;

import org.example.chapter2.ex7.config.ProjectConfig7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig7.class);

        ParrotComponentPost p = context.getBean(ParrotComponentPost.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
