package com.solidPrinciples.liskovSubstitution.abstracts;

import com.solidPrinciples.liskovSubstitution.exception.FraudDetectedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IFraudChecker;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentHandler;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrumentValidator;
import com.solidPrinciples.liskovSubstitution.model.PaymentHandlerResponse;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;

import java.util.Date;

public abstract class BaseBankCard implements IPaymentInstrument {

    private String name, cardNum, code;
    private Date expiryDate;

    public BaseBankCard(String name, String cardNum, String code, Date expiryDate) {
        this.name = name;
        this.cardNum = cardNum;
        this.code = code;
        this.expiryDate = expiryDate;
    }

    protected IPaymentInstrumentValidator basicValidator;
    private IFraudChecker fraudChecker;
    private IPaymentHandler paymentHandler;

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
    }

    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        try {
            fraudChecker.runChecks();
            PaymentHandlerResponse pgResponse = paymentHandler.handlePayment();
            response.setIdentifier(pgResponse.getFingerPrint());
        } catch (FraudDetectedException e) {
            // exception handling
        }
        return response;
    }





}
