package org.lenny.solid.principles.lsp;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Jack");
        Bird penguin = new Penguin("Penny");

        System.out.println("Birds making sounds:");
        sparrow.makeSound(); // Works
        penguin.makeSound(); // Works

        System.out.println("\nFlying birds:");
        FlyingBird flyer = new Sparrow("Skye");
        flyer.fly(); // Valid call
        // You can't pass a Penguin where FlyingBird is expected — LSP respected
    }
}
