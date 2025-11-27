package org.example.volume1.chapter3.ex3.config;


import org.example.volume1.chapter3.models.Parrot3;
import org.example.volume1.chapter3.models.Person3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig3_3 {

    @Bean
    public Parrot3 parrot () {
        Parrot3 p = new Parrot3();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person3 person (Parrot3 parrot) {
        Person3 p = new Person3();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
