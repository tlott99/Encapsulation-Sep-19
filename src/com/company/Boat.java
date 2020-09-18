package com.company;

public class Boat {
    private String name = "a";
    private int length = 0;

    private String initializeName() {

        return "Tinky-Winky";
    }

    public Boat() {

        this.name = initializeName();
    }

    public Boat(int length) {
        this.length = length;
        this.name = initializeName();
    }

    public Boat(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public void setLength(int length) {
        if (length > 10)
            this.length = 10;
        else
            this.length = length;
    }

    public int getLength() {

        return length;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
