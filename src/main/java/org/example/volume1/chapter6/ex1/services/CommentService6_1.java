package org.example.volume1.chapter6.ex1.services;

import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6_1 {
    private Logger logger = Logger.getLogger(CommentService6_1.class.getName());

    public void publishComment(Comment6 comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
