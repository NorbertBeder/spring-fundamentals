package org.example.volume1.chapter5.ex5.config;

import org.example.volume1.chapter5.ex5.services.CommentService5_5;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig5_5 {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService5_5 commentService5_5(){
        return new CommentService5_5();
    }
}


