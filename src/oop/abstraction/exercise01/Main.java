package oop.abstraction.exercise01;

public class Main {
    public static void main(String[] args) {

        Notification email = new EmailNotification("Hello Welcome to Our App", "Example@gmail.com");
        Notification sms = new SMSNotification("Your OTP is","1234567890");
        Notification push = new PushNotification("You have a new Message","device_001");

        System.out.println("        ---- Sending Notification ----      ");
        System.out.println();
        email.send();
        sms.send();
        push.send();

    }

}
