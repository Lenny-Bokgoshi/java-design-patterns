package org.lenny.behavioural.strategy;

public class LowercaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
