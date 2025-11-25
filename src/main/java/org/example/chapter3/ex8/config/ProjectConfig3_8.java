package org.example.chapter3.ex8.config;

import org.example.chapter3.models.Parrot3;
import org.example.chapter3.models.Person3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig3_8 {

    @Bean
    public Parrot3 parrot3_1() {
        Parrot3 p = new Parrot3();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot3 parrot3_2() {
        Parrot3 p = new Parrot3();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person3 person(@Qualifier("parrot3_2") Parrot3 parrot) {
        Person3 p = new Person3();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
