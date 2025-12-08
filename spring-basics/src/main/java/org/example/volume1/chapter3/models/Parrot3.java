package org.example.volume1.chapter3.models;

public class Parrot3 {
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
