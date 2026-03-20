package oop.animalSoundSystem;

public class Dog extends Animal{
    private String breed;

    public Dog(String animalID, String name, int age, String breed) {
        super(animalID, name, age);
        this.breed = breed;
    }
    @Override
    String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    String move() {
        return "run on 4 legs";
    }

    @Override
    public String toString() {
        return super.toString()+" Breed : "+breed;
    }

    public String getBreed() {
        return breed;
    }
}
