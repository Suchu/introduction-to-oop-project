package com.company;

public class Pigeon extends Bird{
    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
    }
}