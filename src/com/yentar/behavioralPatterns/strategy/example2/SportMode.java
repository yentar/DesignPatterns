package com.yentar.behavioralPatterns.strategy.example2;

public class SportMode implements DynamicMode {
    @Override
    public void mode() {
        System.out.println("The car drives in sport mode.");
    }
}
