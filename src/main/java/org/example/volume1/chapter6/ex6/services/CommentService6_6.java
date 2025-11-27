package org.example.volume1.chapter6.ex6.services;

import org.example.volume1.chapter6.ex6.aspects.ToLog6_6;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6_6 {
    private Logger logger = Logger.getLogger(CommentService6_6.class.getName());

    @ToLog6_6
    public String publishComment(Comment6 comment) {
        logger.info("Publishing comment:" + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
