package org.example.volume1.chapter6.ex1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.volume1.chapter6.ex1.services," +
        "org.example.volume1.chapter6.ex1.aspects")
@EnableAspectJAutoProxy
public class ProjectConfig6_1 {

//    @Bean
//    public LoggingAspect loggingAspect(){
//        return new LoggingAspect();
//    }
}
