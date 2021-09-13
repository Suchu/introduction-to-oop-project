package com.company;

public abstract class Bird {
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("Hi there! I can fly.");
    }

    public static void main(String[] args) {

    }
}
