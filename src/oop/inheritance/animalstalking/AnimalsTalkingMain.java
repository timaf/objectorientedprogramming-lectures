package oop.inheritance.animalstalking;

import oop.interfaces.travelingspeeds.Car;

public class AnimalsTalkingMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Kittens");
        cat.sleep();
        cat.talk();

        Dog dog = new Dog("Bello");
        dog.talk();
    }

}
