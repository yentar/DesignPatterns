package com.yentar.behavioralPatterns.strategy.example1;

public class ApplePay implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment wit apple pay...");
    }
}
