package com.yentar.behavioralPatterns.strategy.example2;

public class EngineOilTemperatureDetection implements Sensor {
    private boolean status = false;

    @Override
    public void on() {
        if (!this.status) {
            this.status = true;
        }
        System.out.println("Engine oil temperature detection sensor is aktiv.");
    }

    @Override
    public void off() {
        if (this.status) {
            this.status = false;
        }
        System.out.println("Engine oil temperature detection sensor is inaktiv.");
    }
}
