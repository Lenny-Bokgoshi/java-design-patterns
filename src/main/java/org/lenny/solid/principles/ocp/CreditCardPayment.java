package org.lenny.solid.principles.ocp;

public  class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ZAR" + amount + " using Credit Card.");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited ZAR" + amount + " using Credit Card.");
    }
}
