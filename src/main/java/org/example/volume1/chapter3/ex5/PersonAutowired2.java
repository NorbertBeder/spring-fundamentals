package org.example.volume1.chapter3.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Using @Autowired to inject the values through the constructor

@Component
public class PersonAutowired2 {

    private final ParrotAutowired2 parrot;

    @Autowired
    public PersonAutowired2(ParrotAutowired2 parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return "Ella";
    }

    public ParrotAutowired2 getParrot() {
        return  parrot;
    }
}
