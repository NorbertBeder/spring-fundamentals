package org.example.chapter3.ex4;

import org.example.chapter3.ex4.config.ProjectConfig3_4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_4.class);

        PersonAutowired1 p = context.getBean(PersonAutowired1.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
