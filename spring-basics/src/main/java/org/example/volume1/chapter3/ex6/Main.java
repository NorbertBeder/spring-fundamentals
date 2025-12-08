package org.example.volume1.chapter3.ex6;

import org.example.volume1.chapter3.ex6.config.ProjectConfig3_6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_6.class);

        PersonAutowired3 p = context.getBean(PersonAutowired3.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
