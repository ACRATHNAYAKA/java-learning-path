package oop.animalSoundSystem;

public abstract class Animal {
    private final String animalID;
    private String name;
    private int age;
    public Animal(String animalID, String name, int age){
        if (age<=0) throw new IllegalArgumentException("Invalid Age");

        this.animalID = animalID;
        this.name = name;
        this.age = age;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract String makeSound();
    abstract String move();

    private String describe(){
        return name+" is "+age+" years old, say "+makeSound()+" and "+ move();
    }

    @Override
    public String toString() {
        return super.toString()+" animalID : "+animalID+" name : "+name+" age : "+age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
