package org.example.chapter2.ex6;

import org.example.chapter2.ex6.config.ProjectConfig6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig6.class);

        ParrotComponent p = context.getBean(ParrotComponent.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
