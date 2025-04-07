package org.lenny.behavioural.chainofresponsibility;


/**
 * Passes a request along a chain of handlers until one of them handles it,
 *      promoting loose coupling between sender and receiver.
 *
 * Examples:
 *  > Request Processing Pipeline – Handles HTTP requests through a sequence of filters (e.g., authentication, logging, validation).
 *  > Approval Workflow – Routes a request through multiple approvers (e.g., team lead → manager → director) until one approves or rejects.
 *  > Event Handling System – Sends events through a series of handlers where each one can choose to process or pass it along.
 *  > Customer Support System – Escalates tickets through support tiers (e.g., Level 1 → Level 2 → Technical Expert).
 *  > Logging Framework – Passes log messages through different loggers (e.g., console, file, remote server) based on severity.
 * */
public class Client {
    public static void main(String[] args) {
        AuthenticationHandler auth = new AuthenticationHandler("12345");
        ContentTypeHandler type = new ContentTypeHandler("json");
        PayloadHandler payload = new PayloadHandler("Body: {\"username\" = \"john\"}");

        auth.setNext(type);
        type.setNext(payload);

        String withAuthentication = auth.addHandler("Headers with authentication");
        System.out.println(withAuthentication);

        System.out.println();
        String withoutAuthentication = type.addHandler("Headers without authentication");
        System.out.println(withoutAuthentication);
    }
}
