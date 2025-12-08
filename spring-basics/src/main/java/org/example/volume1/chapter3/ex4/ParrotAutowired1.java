package org.example.volume1.chapter3.ex4;

import org.springframework.stereotype.Component;

@Component
public class ParrotAutowired1 {
    private final String name = "Koko";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
