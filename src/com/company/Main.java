package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Peanuts";
        Boat boat = new Boat("John", 5);
        System.out.println(boat.getName());
        boat.setName(name);
        System.out.println(boat.getName());
        name = "Lala";
        boat.setName(name);
        System.out.println(boat.getName());
        System.out.println(boat.getLength());
    }
}
