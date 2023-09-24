package com.solidPrinciples.liskovSubstitution.interfaces;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;

public interface IPaymentInstrument  {

    void validate() throws PaymentInstrumentInvalidException;

    PaymentResponse collectPayment() throws PaymentFailedException;

}
