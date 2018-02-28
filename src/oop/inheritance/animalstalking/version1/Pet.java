package oop.inheritance.animalstalking.version1;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void talk();

}
