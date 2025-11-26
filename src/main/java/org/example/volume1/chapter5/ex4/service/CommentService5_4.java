package org.example.volume1.chapter5.ex4.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService5_4 {

    public CommentService5_4() {
        System.out.println("CommentService instance created!");
    }
}
