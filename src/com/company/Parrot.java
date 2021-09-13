package com.company;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " Parrot. I can sing Oppa Gangnam Style!");
    }

    public static void main(String[] args) {
        Parrot coco = new Parrot("Coco", "green");
        coco.speak();
        coco.fly();
        coco.spin();
        coco.doTheCaterpillar();
        coco.jump();
    }
}
