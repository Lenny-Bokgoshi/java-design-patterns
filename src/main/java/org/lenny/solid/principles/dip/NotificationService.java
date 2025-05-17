package org.lenny.solid.principles.dip;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }
}
