package com.solidPrinciples.liskovSubstitution.model;

public class PaymentHandlerResponse {

    String fingerPrint;

    private PaymentHandlerResponse(Builder builder) {
        setFingerPrint(builder.fingerPrint);
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }


    public static final class Builder {
        private String fingerPrint;

        public Builder() {
        }

        public Builder fingerPrint(String val) {
            fingerPrint = val;
            return this;
        }

        public PaymentHandlerResponse build() {
            return new PaymentHandlerResponse(this);
        }
    }
}
