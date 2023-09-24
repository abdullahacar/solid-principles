package com.solidPrinciples.openClosed;

import com.solidPrinciples.openClosed.implementations.CashPayment;
import com.solidPrinciples.openClosed.implementations.CreditCardPayment;
import com.solidPrinciples.openClosed.interfaces.PaymentType;
import com.solidPrinciples.openClosed.model.Item;
import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;
import com.solidPrinciples.openClosed.model.Receipt;

public class CheckOuter {

    // This code violates the principle.
    public static Payment checkOut(Receipt receipt) {

        Money total = Money.ZERO;

        for (Item item : receipt.getItems()) {

            total.addValue(item.getPrice());

        }

        boolean withCreditCard = true;

        Payment payment;
        PaymentType paymentType;

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
    public static Payment checkOut(Receipt receipt, PaymentType paymentType) {

        Money total = Money.ZERO;

        for (Item item : receipt.getItems()) {

            total.addValue(item.getPrice());

        }

         return paymentType.acceptPayment(total);

    }

    // Fixed
    public static Payment checkOut_fixed(Receipt receipt) {

        Money total = Money.ZERO;

        for (Item item : receipt.getItems()) {

            total.addValue(item.getPrice());

        }

        boolean withCreditCard = true;

        PaymentType paymentType;

        if (withCreditCard) {

            paymentType = new CreditCardPayment();

        } else {

            paymentType = new CashPayment();

        }

        return paymentType.acceptPayment(total);

    }


}
