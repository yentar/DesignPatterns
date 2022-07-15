package com.yentar.behavioralPatterns.strategy.example1;

public class Paypal implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment wit Paypal...");
    }
}
