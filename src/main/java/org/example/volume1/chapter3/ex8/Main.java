package org.example.volume1.chapter3.ex8;

import org.example.volume1.chapter3.ex8.config.ProjectConfig3_8;
import org.example.volume1.chapter3.models.Person3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_8.class);

        Person3 p = context.getBean(Person3.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
