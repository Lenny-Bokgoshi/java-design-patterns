package org.lenny.solid.principles.dip;

public class EmailSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
