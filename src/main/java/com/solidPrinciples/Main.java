package com.solidPrinciples;

import com.solidPrinciples.dependencyInversion.DependencyInversionTester;
import com.solidPrinciples.interfaceSegregation.InterfaceSegregationTester;
import com.solidPrinciples.liskovSubstitution.LiskovSubstitutionTester;
import com.solidPrinciples.liskovSubstitution.exception.PaymentFailedException;
import com.solidPrinciples.liskovSubstitution.exception.PaymentInstrumentInvalidException;
import com.solidPrinciples.openClosed.OpenClosedTester;
import com.solidPrinciples.openClosed.model.Item;
import com.solidPrinciples.openClosed.model.Money;
import com.solidPrinciples.openClosed.model.Receipt;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("DIP Test");
        DependencyInversionTester.test();

        System.out.println("ISP Test");
        InterfaceSegregationTester.test();

        System.out.println("LSP Test");
        try {
            LiskovSubstitutionTester.test();
        } catch (PaymentInstrumentInvalidException e) {
            throw new RuntimeException(e);
        } catch (PaymentFailedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("OCP Test");
        Receipt receipt = new Receipt();
        receipt.setItems(
                Arrays.asList(
                        new Item.Builder().price(new Money.Builder().value(20.0).build()).build(),
                        new Item.Builder().price(new Money.Builder().value(20.0).build()).build())
        );

        OpenClosedTester.checkOut_fixed(receipt);

    }


}