package oop.abstraction.exercise01;

public class PushNotification extends Notification{

    private String deviceID;

    public PushNotification(String message, String deviceID) {
        super(message);
        this.deviceID = deviceID;
    }

    @Override
    public void send() {
        System.out.println("Sending Push to "+deviceID+" : "+getMessage());
    }
}
