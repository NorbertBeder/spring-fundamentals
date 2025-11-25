package org.example.chapter2.ex4;

import org.example.chapter2.ex4.config.ProjectConfig1_4;
import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig1_4.class);

        Parrot1 p = context.getBean("miki", Parrot1.class);
        System.out.println(p.getName());
    }
}
