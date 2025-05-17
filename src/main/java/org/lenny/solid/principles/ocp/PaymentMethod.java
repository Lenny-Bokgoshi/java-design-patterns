package org.lenny.solid.principles.ocp;

public interface PaymentMethod {
    void pay(double amount);

    void deposit(double amount);
}
