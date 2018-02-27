package oop.inheritance.animalstalking;

public abstract class Pet extends Animal  {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void talk(){
        System.out.println(getTypeOfPet()+ " " + getName()+" talks");
    }

    public abstract String getTypeOfPet();

}
