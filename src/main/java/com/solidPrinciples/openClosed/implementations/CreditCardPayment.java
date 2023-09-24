package com.solidPrinciples.openClosed.implementations;

import com.solidPrinciples.openClosed.interfaces.PaymentInstrument;
import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;
import com.solidPrinciples.openClosed.model.enums.PaymentMethod;

public class CreditCardPayment implements PaymentInstrument {

    @Override
    public Payment acceptPayment(Money money) {
        return new Payment.Builder()
                .paymentMethod(PaymentMethod.CREDIT_CARD)
                .total(money)
                .build();
    }
}
