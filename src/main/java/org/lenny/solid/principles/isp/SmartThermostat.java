package org.lenny.solid.principles.isp;

public class SmartThermostat implements Thermostatic {
    private int temperature;

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + "°C.");
    }
}
