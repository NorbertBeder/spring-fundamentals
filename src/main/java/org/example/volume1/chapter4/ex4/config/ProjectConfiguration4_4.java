package org.example.volume1.chapter4.ex4.config;

import org.example.volume1.chapter4.proxies.CommentNotificationProxy;
import org.example.volume1.chapter4.proxies.EmailCommentNotificationProxy;
import org.example.volume1.chapter4.repositories.CommentRepository;
import org.example.volume1.chapter4.repositories.DBCommentRepository;
import org.example.volume1.chapter4.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration4_4 {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
