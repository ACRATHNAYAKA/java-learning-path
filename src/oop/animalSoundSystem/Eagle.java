package oop.animalSoundSystem;

public class Eagle extends Animal{
    private double wingSpanMeter;

    public Eagle(String animalID, String name, int age, double wingSpanMeter) {
        super(animalID, name, age);
        this.wingSpanMeter = wingSpanMeter;
    }
    @Override
    String makeSound() {
        return "Screech";
    }

    @Override
    String move() {
        return "Flies with wings";
    }

    public double getWingSpanMeter() {
        return wingSpanMeter;
    }

    @Override
    public String toString() {
        return super.toString()+"Eagle Wing Span Meter : "+wingSpanMeter;
    }
}
