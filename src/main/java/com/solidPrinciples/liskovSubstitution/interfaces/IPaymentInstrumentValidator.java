package com.solidPrinciples.liskovSubstitution.interfaces;

import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;

public interface IPaymentInstrumentValidator {

    void validate() throws PaymentInstrumentInvalidException;

}
