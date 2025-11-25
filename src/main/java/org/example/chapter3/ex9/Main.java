package org.example.chapter3.ex9;

import org.example.chapter3.ex9.config.ProjectConfig3_9;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_9.class);

        Person3_9 p = context.getBean(Person3_9.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
