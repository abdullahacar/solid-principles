package com.solidPrinciples.openClosed.interfaces;

import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;

public interface PaymentType {

    Payment acceptPayment(Money money);

}
