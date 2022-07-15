package com.yentar.behavioralPatterns.strategy.example1;

public class PaymentManager {
    private Payment payment;

    public PaymentManager() {
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        this.payment.pay();
    }
}
