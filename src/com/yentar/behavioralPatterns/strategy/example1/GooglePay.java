package com.yentar.behavioralPatterns.strategy.example1;

public class GooglePay implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment wit google pay...");
    }
}
