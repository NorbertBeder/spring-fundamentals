package org.example.chapter2.ex3;

import org.example.chapter2.ex3.config.ProjectConfig3;
import org.example.chapter2.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }
}
