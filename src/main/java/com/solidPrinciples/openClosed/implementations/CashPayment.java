package com.solidPrinciples.openClosed.implementations;

import com.solidPrinciples.openClosed.interfaces.PaymentType;
import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;
import com.solidPrinciples.openClosed.model.enums.PaymentMethod;

public class CashPayment implements PaymentType {
    @Override
    public Payment acceptPayment(Money money) {
        return new Payment.Builder()
                .paymentMethod(PaymentMethod.CASH)
                .total(money)
                .build();
    }
}
