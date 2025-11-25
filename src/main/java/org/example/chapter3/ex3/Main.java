package org.example.chapter3.ex3;

import org.example.chapter3.ex3.config.ProjectConfig3_3;
import org.example.chapter3.models.Parrot3;
import org.example.chapter3.models.Person3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_3.class);

        Person3 person = context.getBean(Person3.class);

        Parrot3 parrot = context.getBean(Parrot3.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
