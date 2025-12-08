package org.example.volume1.chapter3.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Dealing with circular dependencies

@Component
public class ParrotCircular {
    private String name = "Koko";

    @Autowired
    public ParrotCircular(PersonCircular person) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
