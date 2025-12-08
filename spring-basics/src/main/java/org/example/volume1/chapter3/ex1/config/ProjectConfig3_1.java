package org.example.volume1.chapter3.ex1.config;


import org.example.volume1.chapter3.models.Parrot3;
import org.example.volume1.chapter3.models.Person3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig3_1 {

    @Bean
    public Parrot3 parrot () {
        Parrot3 p = new Parrot3();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person3 person () {
        Person3 p = new Person3();
        p.setName("Ella");
        return p;
    }
}
