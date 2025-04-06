package org.lenny.behavioural.facade;

/** Provides a simplified interface to a complex subsystem, making it easier to use.
 *
 * Examples:
 * - Email Service: Offers a single method to send emails while hiding SMTP setup, message formatting,
 *         and error handling.
 * - Order Management: Simplifies order processing by wrapping inventory, payment,
 *          and shipping systems behind one interface.
 * - Authentication Module: Hides the complexity of login, token generation,
 *          and session validation behind a single login service.
 * - Report Aggregator: Provides one method to generate reports by internally coordinating multiple data sources
 *          and formatters.
 * - API Gateway: Acts as a single entry point in microservices architecture, routing requests
 *      and consolidating responses.
 **/
public class Client {
    public static void main(String[] args) {
        NetworkAccessFacade access = new NetworkAccessFacade();
        access.communicate();
    }
}
