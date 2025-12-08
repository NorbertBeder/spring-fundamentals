package org.example.volume1.chapter5.ex1.config;

import org.example.volume1.chapter5.ex1.services.CommentService5_1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig5_1 {

    @Bean
    public CommentService5_1 getCommentService5_1() {
        return new CommentService5_1();
    }
}
