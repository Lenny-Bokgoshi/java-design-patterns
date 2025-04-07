package org.lenny.structural.decorator;

/**
 * Adds new behavior or responsibilities to an object dynamically without altering its structure.
 *
 * Examples:
 *      Logging Wrapper – Wraps services to log input/output without modifying the original service logic.
 *      Security Decorator – Adds authorization checks around sensitive business operations.
 *      Data Compression – Decorates a file stream to compress or encrypt data before saving or sending.
 *      Input Validation – Enhances form processing components by adding field validation behavior.
 *      Caching Layer – Wraps data retrieval services to return cached results for performance improvement.
 ***/
public class Client {
    public static void main(String[] args) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

        normal.makeSmallCoffee();
        normal.makeLargeCoffee();
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeMilkCoffee();
    }
}
