package org.example.volume1.chapter6.ex4.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.volume1.chapter6.ex4.services",
        "org.example.volume1.chapter6.ex4.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig6_4 {

}
