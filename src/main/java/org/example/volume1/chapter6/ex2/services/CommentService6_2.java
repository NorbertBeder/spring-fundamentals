package org.example.volume1.chapter6.ex2.services;

import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6_2 {
    private Logger logger = Logger.getLogger(CommentService6_2.class.getName());

    public String publishComment(Comment6 comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
