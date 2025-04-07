package org.lenny.behavioural.observer;


/**
 * Defines a one-to-many dependency between objects so that when one object changes state,
 *  all its dependents are notified and updated automatically.
 *
 * Examples:
 *  > Event Notification System – Notifies multiple components (e.g., UI, logs, alerts) when a key event occurs.
 *  > Stock Price Tracker – Updates all subscribed clients when stock prices change in real time.
 *  > Workflow Automation – Triggers follow-up tasks or approvals when a process reaches a certain stage.
 *  > Audit Logging – Automatically logs activities when monitored operations are performed.
 *  > Messaging or Pub/Sub Systems – Notifies subscribers when a topic they are interested in receives a new message or event.
 * **/
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailListener = new EmailNotificationListener();
        LogOpenListener logListener = new LogOpenListener();

        editor.getEvents().subscribe("open", emailListener);
        editor.getEvents().subscribe("save", emailListener);
        editor.getEvents().subscribe("open", logListener);

        editor.openFile("test.jpg");
        editor.saveFile();

        System.out.println();

        editor.getEvents().unsubscribe("save", emailListener);

        editor.openFile("test1.jpg");
        editor.saveFile();
    }
}
