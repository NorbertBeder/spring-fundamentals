package org.example.volume1.chapter5.ex7.service;

import org.example.volume1.chapter5.ex7.model.Comment7;
import org.example.volume1.chapter5.ex7.processor.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService5_7 {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment7 c){
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
    }
}
