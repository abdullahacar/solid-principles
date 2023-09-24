package com.solidPrinciples.interfaceSegregation;

public class UntraceableDelivery extends Delivery {

    public UntraceableDelivery(String referenceNo) {
        super(referenceNo);
    }

    private UntraceableDelivery(Builder builder) {
        super(builder.referenceNo);
        setReferenceNo(builder.referenceNo);
    }


    public static final class Builder {
        private String referenceNo;

        public Builder() {
        }

        public Builder referenceNo(String val) {
            referenceNo = val;
            return this;
        }

        public UntraceableDelivery build() {
            return new UntraceableDelivery(this);
        }
    }
}
