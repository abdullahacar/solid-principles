package com.solidPrinciples.liskovSubstitution;

import com.solidPrinciples.liskovSubstitution.abstracts.BaseBankCard;
import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.implementations.RewardsCard;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.model.CreditCard;
import com.solidPrinciples.liskovSubstitution.model.DebitCard;
import com.solidPrinciples.liskovSubstitution.model.OrderDetails;
import com.solidPrinciples.liskovSubstitution.model.PaymentResponse;
import com.solidPrinciples.openClosed.implementations.CreditCardPayment;
import com.solidPrinciples.openClosed.interfaces.PaymentInstrument;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiskovSubstitutionTester {

    public static void test() throws PaymentInstrumentInvalidException, PaymentFailedException {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        OrderDetails orderDetails = new OrderDetails();

        BaseBankCard debitCard = new DebitCard("John Doe", "123132", "00", new Date());

        paymentProcessor.process(orderDetails, debitCard);

        BaseBankCard creditCard = new CreditCard("John Doe", "123132", "00", new Date());

        paymentProcessor.process(orderDetails, creditCard);

        // This is for LSP
        RewardsCard rewardsCard = new RewardsCard("John Doe","123");

        List<IPaymentInstrument> instruments = new ArrayList<>();
        instruments.add(debitCard);
        instruments.add(creditCard);
        instruments.add(rewardsCard);

        for (IPaymentInstrument instrument : instruments) {
            PaymentResponse paymentResponse = paymentProcessor.process(orderDetails, instrument);
            System.out.println(paymentResponse.getIdentifier());
        }

        paymentProcessor.process(orderDetails, rewardsCard);

    }

}
