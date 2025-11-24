package org.example.chapter2.ex5;

import org.example.chapter2.ex5.config.ProjectConfig5;
import org.example.chapter2.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig5.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
