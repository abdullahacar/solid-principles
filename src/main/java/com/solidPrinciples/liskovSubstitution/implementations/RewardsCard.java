package com.solidPrinciples.liskovSubstitution.implementations;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;

public class RewardsCard implements IPaymentInstrument {
    String name;
    String cardNumber;

    public RewardsCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        if (name == null || name.isEmpty()) throw new PaymentInstrumentInvalidException("Name is not present for card");
    }

    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        // Steps related to rewards card payment like getting current
        // rewards balance, updating balance etc.
        response.setIdentifier(cardNumber);
        return response;
    }


}
