package org.example.volume1.chapter5.ex3;

import org.example.volume1.chapter5.ex3.config.ProjectConfig5_3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig5_3.class);
    }
}
