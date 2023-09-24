package com.solidPrinciples.liskovSubstitution;

import com.solidPrinciples.liskovSubstitution.abstracts.BaseBankCard;
import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.liskovSubstitution.implementations.RewardsCard;
import com.solidPrinciples.liskovSubstitution.interfaces.IPaymentInstrument;
import com.solidPrinciples.liskovSubstitution.model.CreditCard;
import com.solidPrinciples.liskovSubstitution.model.DebitCard;
import com.solidPrinciples.liskovSubstitution.model.OrderDetails;
import com.solidPrinciples.openClosed.implementations.CreditCardPayment;

import java.util.Date;

public class Tester {

    public static void test() throws PaymentInstrumentInvalidException, PaymentFailedException {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        OrderDetails orderDetails = new OrderDetails();

        BaseBankCard debitCard = new DebitCard("John Doe", "123132", "00", new Date());

        paymentProcessor.process(orderDetails, debitCard);

        BaseBankCard creditCard = new CreditCard("John Doe", "123132", "00", new Date());

        paymentProcessor.process(orderDetails, creditCard);

        // This is for LSP
        RewardsCard rewardsCard = new RewardsCard("John Doe","123");
        paymentProcessor.process(orderDetails, rewardsCard);

    }

}
