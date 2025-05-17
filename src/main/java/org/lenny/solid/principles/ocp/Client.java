package org.lenny.solid.principles.ocp;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod crypto = new CryptoPayment(); // Added without modifying PaymentProcessor

        processor.processPayment(creditCard, 150.0);
        processor.processPayment(paypal, 75.5);
        processor.processPayment(crypto, 300.0);
    }
}
