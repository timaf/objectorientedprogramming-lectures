package oop.inheritance.animalstalking;

public class Dog extends Pet {


    public Dog(String name) {
        super(name);
    }

    @Override
    public String getTypeOfPet() {
        return "Dog";
    }
}
