package org.lenny.solid.principles.dip;

public class Client {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailSender();
        Notifier smsNotifier = new SMSSender();

        NotificationService emailService = new NotificationService(emailNotifier);
        NotificationService smsService = new NotificationService(smsNotifier);

        emailService.sendNotification("Invoice has been generated.");
        smsService.sendNotification("Your OTP is 123456.");
    }
}
