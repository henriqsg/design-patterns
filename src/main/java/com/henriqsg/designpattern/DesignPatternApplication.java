package com.henriqsg.designpattern;

import com.henriqsg.designpattern.strategy.CreditCardPaymentStrategy;
import com.henriqsg.designpattern.strategy.DebitCardPaymentStrategy;
import com.henriqsg.designpattern.strategy.Purchase;

public class DesignPatternApplication {

	public static void main(String[] args) {
		Purchase purchase = new Purchase(10, new DebitCardPaymentStrategy());
		purchase.executePayment();

		purchase.setPaymentStrategy(new CreditCardPaymentStrategy());
		purchase.executePayment();
	}
}
