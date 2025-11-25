package org.example.chapter3.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Using @Autowired to inject the values through the class fields

@Component
public class PersonAutowired1 {

    public String getName() {
        return "Ella";
    }

    @Autowired
    private ParrotAutowired1 parrot;

    public ParrotAutowired1 getParrot() {
        return  parrot;
    }
}
