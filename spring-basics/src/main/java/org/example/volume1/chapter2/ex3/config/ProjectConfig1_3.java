package org.example.volume1.chapter2.ex3.config;

import org.example.volume1.chapter2.models.Parrot1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1_3 {

    @Bean
    Parrot1 parrot1_1() {
        var p = new Parrot1();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot1 parrot1_2() {
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
