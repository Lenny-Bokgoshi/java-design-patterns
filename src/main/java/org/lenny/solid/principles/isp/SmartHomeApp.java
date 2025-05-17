package org.lenny.solid.principles.isp;

public class SmartHomeApp {
    public static void main(String[] args) {
        Switchable light = new SmartLight();
        Thermostatic thermostat = new SmartThermostat();
        Lockable doorLock = new SmartDoorLock();

        light.turnOn();
        light.turnOff();

        thermostat.setTemperature(22);

        doorLock.lock();
        doorLock.unlock();
    }
}
