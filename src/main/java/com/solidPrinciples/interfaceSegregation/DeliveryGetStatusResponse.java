package com.solidPrinciples.interfaceSegregation;

public class DeliveryGetStatusResponse extends BaseResponse {

    private String status;

    private DeliveryGetStatusResponse(Builder builder) {
        setExceptionMessage(builder.exceptionMessage);
        setStatusCode(builder.statusCode);
        status = builder.status;
    }


    public static final class Builder {
        private String exceptionMessage;
        private String statusCode;
        private String status;

        public Builder() {
        }

        public Builder exceptionMessage(String val) {
            exceptionMessage = val;
            return this;
        }

        public Builder statusCode(String val) {
            statusCode = val;
            return this;
        }

        public Builder status(String val) {
            status = val;
            return this;
        }

        public DeliveryGetStatusResponse build() {
            return new DeliveryGetStatusResponse(this);
        }
    }
}
