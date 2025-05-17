package org.lenny.solid.principles.dip;

public class SMSSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
