package com.solidPrinciples.liskovSubstitution.model;

import com.solidPrinciples.liskovSubstitution.abstracts.BaseBankCard;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IFraudChecker;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentHandler;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrumentValidator;

import java.util.Date;

public class DebitCard extends BaseBankCard {

    public DebitCard(String name, String cardNum, String code, Date expiryDate) {
        super(name, cardNum, code, expiryDate);
    }

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
        // additional validations for debit cards
    }

}
