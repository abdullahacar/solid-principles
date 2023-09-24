package com.solidPrinciples.openClosed.interfaces;

import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Payment;

public interface PaymentInstrument {

    Payment acceptPayment(Money money);

}
