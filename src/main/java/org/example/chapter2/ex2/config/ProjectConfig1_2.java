package org.example.chapter2.ex2.config;


import org.example.chapter2.models.Parrot1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1_2 {

    @Bean
    Parrot1 parrot() {
        var p = new Parrot1();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
