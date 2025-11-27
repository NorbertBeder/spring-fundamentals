package org.example.volume1.chapter6.ex3.services;

import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6_3 {
    private Logger logger = Logger.getLogger(CommentService6_3.class.getName());

    public String publishComment(Comment6 comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
