package org.example.volume1.chapter3.ex2;

import org.example.volume1.chapter3.ex2.config.ProjectConfig3_2;
import org.example.volume1.chapter3.models.Parrot3;
import org.example.volume1.chapter3.models.Person3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3_2.class);

        Person3 person = context.getBean(Person3.class);

        Parrot3 parrot = context.getBean(Parrot3.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
