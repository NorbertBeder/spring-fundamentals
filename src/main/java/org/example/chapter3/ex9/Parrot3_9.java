package org.example.chapter3.ex9;

public class Parrot3_9 {
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
