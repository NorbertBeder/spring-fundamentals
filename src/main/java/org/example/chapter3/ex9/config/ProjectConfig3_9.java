package org.example.chapter3.ex9.config;

import org.example.chapter3.ex9.Parrot3_9;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.chapter3.ex9")
public class ProjectConfig3_9 {

    @Bean
    public Parrot3_9 parrot9_1(){
        Parrot3_9 p = new Parrot3_9();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot3_9 parrot9_2(){
        Parrot3_9 p = new Parrot3_9();
        p.setName("Miki");
        return p;
    }
}
