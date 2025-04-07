package org.lenny.behavioural.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Allows an object to change its behavior when its internal state changes, appearing as if it changed its class.
 *
 * Examples:
 *  > Order Processing – Represents different order states (e.g., Pending, Shipped, Delivered, Cancelled)
 *      with distinct behaviors.
 *  > Document Workflow – Handles document states like Draft, Submitted, Approved, or Rejected
 *      with unique transitions and actions.
 *  > User Session – Manages session states such as Logged Out, Logged In, or Expired with appropriate access control.
 *  > ATM Machine – Changes behavior based on states like No Card, Has Card, Correct PIN, or Out of Service.
 *  > Customer Support Ticket – Processes tickets through states like Open, In Progress, Escalated,
 *      and Resolved with tailored logic.
 * **/
public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        do {
            System.out.print("-- Please input command: ");
            try {
                input = reader.readLine().trim().toLowerCase();
                switch (input) {
                    case "w": game.getState().onWelcomeScreen();
                        break;
                    case "p": game.getState().onPlaying();
                        break;
                    case "b": game.getState().onBreak();
                        break;
                    case "e": game.getState().onEndGame();
                        break;
                    default: System.out.println("-- Unknown command --");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!input.equals("exit"));
    }
}
