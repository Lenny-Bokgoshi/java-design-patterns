package org.lenny.behavioural.mediator;


/**
 * Defines an object that centralizes communication between components, reducing dependencies between them.
 *
 * Examples:
 *  > Chat System – Manages communication between users in a chat room, where the mediator handles all messages instead of direct user-to-user communication.
 *  > Order Processing System – Coordinates the interaction between payment, inventory, and shipping systems, ensuring they work together without direct dependencies.
 *  > UI Component Coordination – Mediates communication between various UI components (e.g., buttons, text fields) in a form or dashboard.
 *  > Workflow Management – Coordinates multiple tasks and components in a process, ensuring they communicate through a central mediator instead of directly interacting.
 *  > Customer Support – Manages interactions between support agents, tickets, and notification systems through a central hub.
 * */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser alice = new ChatUser("Alice", mediator);
        ChatUser bob = new ChatUser("Bob", mediator);
        ChatUser carol = new ChatUser("Carol", mediator);

        mediator.addUser(alice).addUser(bob).addUser(carol);

        carol.sendMessage("Hello everyone!");
    }
}
