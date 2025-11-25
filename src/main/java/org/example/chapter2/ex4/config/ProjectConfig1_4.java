package org.example.chapter2.ex4.config;

import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1_4 {
    @Bean
    Parrot1 parrot1() {
        var p = new Parrot1();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "miki")
    Parrot1 parrot2() {
        var p = new Parrot1();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot1 parrot3() {
        var p = new Parrot1();
        p.setName("Riki");
        return p;
    }
}
