package com.henriqsg.designpattern.strategy;

public class Purchase {

    private int value;
    private PaymentStrategy paymentStrategy;

    public Purchase(int value, PaymentStrategy paymentStrategy) {
        this.value = value;
        this.paymentStrategy = paymentStrategy;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void executePayment() {
        paymentStrategy.pay(value);
    }
}
