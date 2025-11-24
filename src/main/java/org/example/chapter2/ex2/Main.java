package org.example.chapter2.ex2;

import org.example.chapter2.ex2.config.ProjectConfig2;
import org.example.chapter2.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

    }
}