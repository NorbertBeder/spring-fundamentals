package org.example.chapter3.ex6;

import org.springframework.stereotype.Component;

@Component
public class ParrotAutowired3 {
    private final String name = "Koko";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
