package org.example.chapter3.ex6;

// Using dependency injection through the setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAutowired3 {
    private final String name = "Ella";

    private ParrotAutowired3 parrot;

    @Autowired
    public void setParrotAutowired3(ParrotAutowired3 parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return  name;
    }
    public ParrotAutowired3 getParrot() {
        return parrot;
    }
}
