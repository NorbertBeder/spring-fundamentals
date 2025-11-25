package org.example.chapter3.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Dealing with circular dependencies

@Component
public class ParrotCircular {
    private String name = "Koko";

    private final PersonCircular person;

    @Autowired
    public ParrotCircular(PersonCircular person) {
        this.person = person;
    }
}
