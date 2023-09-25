package com.solidPrinciples.openClosed;

import com.solidPrinciples.openClosed.implementations.CashPayment;
import com.solidPrinciples.openClosed.implementations.CreditCardPayment;
import com.solidPrinciples.openClosed.interfaces.PaymentInstrument;
import com.solidPrinciples.openClosed.model.Item;
import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;
import com.solidPrinciples.openClosed.model.Receipt;

public class OpenClosedTester {

    // This code violates the principle.
    private static Payment checkOut(Receipt receipt) {

        Money total = Money.ZERO;

        for (Item item : receipt.getItems()) {

            total.addValue(item.getPrice());

        }

        boolean withCreditCard = true;

        Payment payment;
        PaymentInstrument paymentType;

        if (withCreditCard) {

            paymentType = new CreditCardPayment();
            payment = paymentType.acceptPayment(total);

        } else {

            paymentType = new CashPayment();
            payment = paymentType.acceptPayment(total);

        }

        return payment;

    }

    // This fixes the mess
    private static Payment checkOut(Receipt receipt, PaymentInstrument paymentType) {

        Money total = Money.ZERO;

        for (Item item : receipt.getItems()) {

            total.addValue(item.getPrice());

        }

        return paymentType.acceptPayment(total);

    }

    // Fixed
    public static Payment checkOut_fixed(Receipt receipt) {

        boolean withCreditCard = true;

        PaymentInstrument paymentType;

        if (withCreditCard) {

            paymentType = new CreditCardPayment();

        } else {

            paymentType = new CashPayment();

        }

        return checkOut(receipt, paymentType);

    }


}
