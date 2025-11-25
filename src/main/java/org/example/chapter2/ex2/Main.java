package org.example.chapter2.ex2;

import org.example.chapter2.ex2.config.ProjectConfig1_2;
import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig1_2.class);

        Parrot1 p = context.getBean(Parrot1.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

    }
}