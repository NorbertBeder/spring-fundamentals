package org.example.chapter2.ex8;

import org.example.chapter2.ex8.config.ProjectConfig8;
import org.example.chapter2.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig8.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
