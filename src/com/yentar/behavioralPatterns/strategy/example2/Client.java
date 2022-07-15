package com.yentar.behavioralPatterns.strategy.example2;

public class Client {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.setDynamicMode(new ComfortMode());
        audi.setSensors(new EngineOilTemperatureDetection());

        audi.changeDynamicMode();
        audi.activateSensor();

        audi.setDynamicMode(new SportMode());
        audi.changeDynamicMode();
        audi.deactivateSensor();

        // ------------------------------------------------

        BMW bwm = new BMW();
        bwm.setDynamicMode(new SportMode());
        bwm.setSensors(new DriverDrowsinessDetection());

        bwm.changeDynamicMode();
        bwm.activateSensor();
    }
}
