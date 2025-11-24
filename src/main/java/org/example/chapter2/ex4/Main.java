package org.example.chapter2.ex4;

import org.example.chapter2.ex4.config.ProjectConfig4;
import org.example.chapter2.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig4.class);

        Parrot p = context.getBean("miki", Parrot.class);
        System.out.println(p.getName());
    }
}
