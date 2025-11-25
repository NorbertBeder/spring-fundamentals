package org.example.chapter2.ex8;

import org.example.chapter2.ex8.config.ProjectConfig1_8;
import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig1_8.class);

        Parrot1 x = new Parrot1();
        x.setName("Kiki");

        Supplier<Parrot1> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot1.class, parrotSupplier);

        Parrot1 p = context.getBean(Parrot1.class);
        System.out.println(p.getName());
    }
}
