package oop.animalSoundSystem;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("A001","Buddy",3,"Golden Retriever");
        Animal animal2 = new Eagle("A002", "Sky",5,2.5);

        Animal [] animals = {animal1, animal2};

        for (Animal animal: animals){
            System.out.println(animal.describe());
        }

        System.out.println("Result : "+animal1.equals(animal2));

        for (Animal animal: animals){
            System.out.println(animal.toString());
        }
    }


}
