package org.example.chapter2.ex5.config;

import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig1_5 {
    @Bean
    Parrot1 parrot1() {
        var p = new Parrot1();
        p.setName("Koko");
        return p;
    }

    @Bean
    @Primary
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
