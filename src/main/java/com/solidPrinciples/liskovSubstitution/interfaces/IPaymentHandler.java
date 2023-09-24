package com.solidPrinciples.liskovSubstitution.interfaces;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.model.PaymentHandlerResponse;

public interface IPaymentHandler {

    PaymentHandlerResponse handlePayment() throws PaymentFailedException;

}
