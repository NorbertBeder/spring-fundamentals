package org.example.volume1.chapter3.ex7;

import org.example.volume1.chapter3.ex7.config.ProjectConfig3_7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Circular == Bad

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_7.class);

        PersonCircular p = context.getBean(PersonCircular.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
