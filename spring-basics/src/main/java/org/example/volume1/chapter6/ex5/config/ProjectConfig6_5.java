package org.example.volume1.chapter6.ex5.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.volume1.chapter6.ex5.services",
        "org.example.volume1.chapter6.ex5.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig6_5 {

}
