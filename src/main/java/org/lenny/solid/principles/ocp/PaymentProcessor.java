package org.lenny.solid.principles.ocp;

public class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
        method.deposit(amount);
    }
}
