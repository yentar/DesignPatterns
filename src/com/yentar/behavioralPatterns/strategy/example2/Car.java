package com.yentar.behavioralPatterns.strategy.example2;

public abstract class Car {
    private DynamicMode dynamicMode;
    private Sensor sensor;

    public void setDynamicMode(DynamicMode dynamicMode) {
        this.dynamicMode = dynamicMode;
    }

    public void setSensors(Sensor sensor) {
        this.sensor = sensor;
    }

    public void changeDynamicMode() {
        this.dynamicMode.mode();
    }

    public void activateSensor() {
        this.sensor.on();
    }

    public void deactivateSensor() {
        this.sensor.off();
    }
}
