package org.lenny.solid.principles.ocp;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ZAR" + amount + " using PayPal.");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited ZAR" + amount + " using PayPal.");
    }
}
