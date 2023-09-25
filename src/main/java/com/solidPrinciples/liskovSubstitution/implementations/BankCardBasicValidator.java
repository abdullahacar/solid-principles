package com.solidPrinciples.liskovSubstitution.implementations;

import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrumentValidator;

public class BankCardBasicValidator implements IPaymentInstrumentValidator {

    private String name;

    public BankCardBasicValidator(String name) {
        this.name = name;
    }

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (name == null || name.isEmpty()) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other basic validations
    }
}
