package org.example.chapter3.ex9;

import org.example.chapter3.models.Parrot3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person3_9 {
    private String name = "Ella";

    private final Parrot3_9 parrot;

    public Person3_9(@Qualifier("parrot9_2") Parrot3_9 parrot) {
        this.parrot = parrot;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Parrot3_9 getParrot(){
        return parrot;
    }
}
