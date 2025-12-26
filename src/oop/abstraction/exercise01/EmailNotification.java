package oop.abstraction.exercise01;

public class EmailNotification extends Notification {

    private String recipientEmail;

    public EmailNotification(String message, String recipientEmail) {
        super(message);
        this.recipientEmail = recipientEmail;
    }

    @Override
    public void send() {
        System.out.println("Sending Email to "+recipientEmail+" : "+getMessage());
    }
}
