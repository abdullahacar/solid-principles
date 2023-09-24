package com.solidPrinciples.liskovSubstitution.exception;

public class PaymentInstrumentInvalidException extends Exception {

    private String description;

    public PaymentInstrumentInvalidException(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
