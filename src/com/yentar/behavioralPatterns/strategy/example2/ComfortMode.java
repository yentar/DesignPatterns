package com.yentar.behavioralPatterns.strategy.example2;

public class ComfortMode implements DynamicMode{
    @Override
    public void mode() {
        System.out.println("The car drives in comfort mode.");
    }
}
