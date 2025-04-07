package org.lenny.behavioural.command;

public class OrderExecuteCommand implements Command {
    protected int id;

    public OrderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Order " + id + " executed");
    }
}
