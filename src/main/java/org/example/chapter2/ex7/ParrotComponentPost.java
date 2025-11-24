package org.example.chapter2.ex7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ParrotComponentPost {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }
}
