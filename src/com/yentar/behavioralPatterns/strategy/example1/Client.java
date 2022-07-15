package com.yentar.behavioralPatterns.strategy.example1;

public class Client {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        Payment payment = new GooglePay();
        paymentManager.setPayment(payment);
        paymentManager.pay();

        payment = new Paypal();
        paymentManager.setPayment(payment);
        paymentManager.pay();

        payment = new ApplePay();
        paymentManager.setPayment(payment);
        paymentManager.pay();
    }
}
