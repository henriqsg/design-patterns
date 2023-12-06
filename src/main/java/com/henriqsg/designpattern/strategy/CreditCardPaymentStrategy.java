package com.henriqsg.designpattern.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int value) {
        System.out.println(value + " paid with CREDIT card.");
    }
}
