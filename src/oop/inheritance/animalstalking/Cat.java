package oop.inheritance.animalstalking;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Miau!");
    }

    @Override
    public String getTypeOfPet() {
        return "Cat";
    }
}
