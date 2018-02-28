package oop.inheritance.animalstalking.version1;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says woof");
    }
}
