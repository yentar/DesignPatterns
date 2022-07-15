package com.yentar.behavioralPatterns.strategy.example2;

public class DriverDrowsinessDetection implements Sensor {
    private boolean status = false;

    @Override
    public void on() {
        if (!this.status) {
            this.status = true;
        }
        System.out.println("Driver drowsiness detection sensor is aktiv.");
    }

    @Override
    public void off() {
        if (this.status) {
            this.status = false;
        }
        System.out.println("Driver drowsiness detection sensor is inaktiv.");
    }
}
