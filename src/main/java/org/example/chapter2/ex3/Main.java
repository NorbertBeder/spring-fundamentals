package org.example.chapter2.ex3;

import org.example.chapter2.ex3.config.ProjectConfig1_3;
import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig1_3.class);

        Parrot1 p = context.getBean("parrot1_2", Parrot1.class);
        System.out.println(p.getName());
    }
}
