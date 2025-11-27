package org.example.volume1.chapter2.ex5;

import org.example.volume1.chapter2.ex5.config.ProjectConfig1_5;
import org.example.volume1.chapter2.models.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig1_5.class);

        Parrot1 p = context.getBean(Parrot1.class);
        System.out.println(p.getName());
    }
}
