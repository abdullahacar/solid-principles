package com.solidPrinciples.liskovSubstitution.implementations;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentHandler;
import com.solidPrinciples.liskovSubstitution.model.PaymentHandlerResponse;

class PaymentHandler implements IPaymentHandler {

    @Override
    public PaymentHandlerResponse handlePayment() throws PaymentFailedException {
        return new PaymentHandlerResponse();
    }
}
