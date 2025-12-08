package org.example.volume1.chapter2.ex7;

import org.example.volume1.chapter2.ex7.config.ProjectConfig1_7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig1_7.class);

        ParrotComponentPost p = context.getBean(ParrotComponentPost.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
