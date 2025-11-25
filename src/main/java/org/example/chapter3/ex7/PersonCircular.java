package org.example.chapter3.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Dealing with circular dependencies

@Component
public class PersonCircular {
    private final String name = "Joe";
    private final ParrotCircular parrot;

    @Autowired
    public PersonCircular(ParrotCircular parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public ParrotCircular getParrot() {
        return parrot;
    }
}
