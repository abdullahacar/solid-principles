package com.solidPrinciples.liskovSubstitution.model;

import com.solidPrinciples.liskovSubstitution.abstracts.BaseBankCard;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;

import java.util.Date;

public class CreditCard extends BaseBankCard {

    public CreditCard(String name, String cardNum, String code, Date expiryDate) {
        super(name, cardNum, code, expiryDate);
    }
    // constructor omitted

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
        // additional validations for credit cards
    }
}
