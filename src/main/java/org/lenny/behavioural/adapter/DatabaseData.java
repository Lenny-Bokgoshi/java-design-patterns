package org.lenny.behavioural.adapter;

public class DatabaseData {
    private int position;
    private int amount;

    public DatabaseData(int position, int amount) {
        this.position = position;
        this.amount = amount;
    }

    public int getPosition() {
        return position;
    }

    public int getAmount() {
        return amount;
    }
}
