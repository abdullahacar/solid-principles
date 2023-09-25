package com.solidPrinciples.liskovSubstitution;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.model.OrderDetails;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;

public class PaymentProcessor {

    public PaymentResponse process(OrderDetails orderDetails, IPaymentInstrument paymentInstrument) throws PaymentInstrumentInvalidException, PaymentFailedException {

        PaymentResponse response = null;

        try {
            paymentInstrument.validate();
            response = paymentInstrument.collectPayment();
            saveToDatabase(orderDetails, response.getIdentifier());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    private void saveToDatabase(OrderDetails orderDetails, String identifier) {
        // save the identifier and order details in DB
    }

}
