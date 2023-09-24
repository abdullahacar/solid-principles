package com.solidPrinciples.interfaceSegregation;

public class TraceableDelivery extends Delivery {

    private String status;

    private TraceableDelivery(String referenceNo) {
        super(referenceNo);
    }

    private TraceableDelivery(Builder builder) {
        super(builder.referenceNo);
        setReferenceNo(builder.referenceNo);
        status = builder.status;
    }


    public static final class Builder {
        private String referenceNo;
        private String status;

        public Builder() {
        }

        public Builder referenceNo(String val) {
            referenceNo = val;
            return this;
        }

        public Builder status(String val) {
            status = val;
            return this;
        }

        public TraceableDelivery build() {
            return new TraceableDelivery(this);
        }
    }
}
