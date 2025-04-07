package org.lenny.behavioural.memento;


/**
 * Captures and stores an object's internal state so it can be restored later without violating encapsulation.
 *
 * Examples:
 *  > Form Draft Saving – Saves form data as a snapshot, allowing users to restore previous versions or drafts.
 *  > Undo/Redo Functionality – Stores snapshots of object states to enable undo and redo operations in editors or workflows.
 *  > Transaction Rollback – Captures the state of a database or service before performing actions, enabling rollback on failure.
 *  > Game State Management – Saves and restores game progress at specific checkpoints.
 *  > Workflow State Recovery – Remembers workflow progress in case of failure or restart, restoring to the last known state.
 * */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("Initial state");
        Caretaker caretaker = new Caretaker();

        caretaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.getState());

        originator.setState("State 1");
        caretaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.getState());

        originator.setState("State 2");
        caretaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.getState());

        System.out.println("---------------");

        originator.restoreMemento(caretaker.restoreState(1));
        System.out.println("Current state is: " + originator.getState());

        originator.restoreMemento(caretaker.restoreState(0));
        System.out.println("Current state is: " + originator.getState());

        originator.restoreMemento(caretaker.restoreState(2));
        System.out.println("Current state is: " + originator.getState());
    }
}
