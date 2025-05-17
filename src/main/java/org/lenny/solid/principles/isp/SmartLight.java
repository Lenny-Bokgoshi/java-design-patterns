package org.lenny.solid.principles.isp;

public class SmartLight implements Switchable {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart light is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart light is turned OFF.");
    }
}
