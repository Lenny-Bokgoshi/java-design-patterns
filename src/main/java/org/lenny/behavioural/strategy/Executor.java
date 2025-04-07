package org.lenny.behavioural.strategy;

public class Executor {
    private PrintStrategy strategy;

    public Executor(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printString(String input) {
        System.out.println(strategy.formatString(input));
    }

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }
}
