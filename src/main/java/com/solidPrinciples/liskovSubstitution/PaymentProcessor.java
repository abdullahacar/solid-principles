package com.solidPrinciples.liskovSubstitution;

import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.model.OrderDetails;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;

public class PaymentProcessor {

    public void process(
            OrderDetails orderDetails,
            IPaymentInstrument paymentInstrument) throws PaymentInstrumentInvalidException, PaymentFailedException {
        try {
            paymentInstrument.validate();
            PaymentResponse response = paymentInstrument.collectPayment();
            saveToDatabase(orderDetails, response.getIdentifier());
        } catch (Exception e){
            // exception handling
        }
    }

    private void saveToDatabase(OrderDetails orderDetails, String identifier) {
        // save the identifier and order details in DB
    }

}
