package org.lenny.behavioural.command;
/**
 * Encapsulates a request as an object, allowing for parameterization of clients,
 *      queuing, logging, and support for undoable operations.
 *
 * Examples:
 *  > Task Scheduler – Queues and executes commands like sending emails, generating reports,
 *          or syncing data at scheduled times.
 *  > Undo/Redo Functionality – Stores executed commands to reverse or reapply operations
 *          (e.g., in a text editor or form builder).
 *  > Workflow Engine – Represents business steps (e.g., approve, reject, escalate)
 *          as command objects that can be executed in sequence.
 *  > Remote Control Systems – Maps each button to a command that triggers specific actions
 *          (common in IoT or smart apps).
 *  > Audit Logging – Logs each command executed in the system for traceability and compliance reporting.
 ****/
public class Client {
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1, 12.99))
                .addCommand(new OrderAddCommand(2, 15.99))
                .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(1))
                .processCommands();
    }
}
