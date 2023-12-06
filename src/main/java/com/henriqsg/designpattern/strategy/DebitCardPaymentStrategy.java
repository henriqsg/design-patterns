package com.henriqsg.designpattern.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int value) {
        System.out.println(value + " paid with DEBIT card.");
    }
}
