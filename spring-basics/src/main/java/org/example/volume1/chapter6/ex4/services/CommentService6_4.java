package org.example.volume1.chapter6.ex4.services;

import org.example.volume1.chapter6.ex4.aspects.ToLog6_4;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6_4 {
    private Logger logger = Logger.getLogger(CommentService6_4.class.getName());

    public void publishComment(Comment6 comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog6_4
    public void deleteComment(Comment6 comment){
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment6 comment){
        logger.info("Editing comment: " + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
