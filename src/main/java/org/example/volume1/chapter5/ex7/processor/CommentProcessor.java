package org.example.volume1.chapter5.ex7.processor;

import org.example.volume1.chapter5.ex7.model.Comment7;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment7 comment;

    public void setComment(Comment7 comment) {
        this.comment = comment;
    }

    public Comment7 getComment(){
        return this.comment;
    }

    public void processComment(Comment7 comment) {
    }

    public void validateComment(Comment7 comment) {
    }


}
