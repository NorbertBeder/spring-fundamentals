package org.example.chapter3.ex5;

import org.example.chapter3.ex5.config.ProjectConfig3_5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_5.class);

        PersonAutowired2 p = context.getBean(PersonAutowired2.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
