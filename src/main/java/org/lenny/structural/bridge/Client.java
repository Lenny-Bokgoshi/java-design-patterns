package org.lenny.structural.bridge;


/**
 *  Separates an abstraction from its implementation so that the two can vary independently.
 * <p>
 *  Examples:
 *  - Report Generator: Decouples the report format (PDF, HTML, CSV) from the data source logic,
 *          allowing each to change independently.
 *  - Notification System: Separates notification types (e.g., alerts, reminders) from delivery mechanisms
 *          (e.g., email, SMS, push).
 *  - UI Theme System: Bridges UI components with multiple themes or platforms (e.g., desktop vs mobile rendering).
 *  - Payment Processing: Decouples payment workflows (e.g., one-time, subscription) from gateway providers
 *          (e.g., PayPal, Stripe).
 *  - Data Export Service: Allows different export triggers (e.g., manual, scheduled) to work
 *          with multiple export formats (e.g., Excel, JSON).
 **/
public class Client {
    public static void main(String[] args) {
        App app1 = new Facebook(new IOS());
        App app2 = new Instagram(new Android());

        app1.runApp();
        app2.runApp();
    }
}
