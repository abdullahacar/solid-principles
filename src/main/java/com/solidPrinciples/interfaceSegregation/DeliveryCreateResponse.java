package com.solidPrinciples.interfaceSegregation;

public class DeliveryCreateResponse extends BaseResponse {


    private DeliveryCreateResponse(Builder builder) {
        setExceptionMessage(builder.exceptionMessage);
        setStatusCode(builder.statusCode);
    }

    public static final class Builder {
        private String exceptionMessage;
        private String statusCode;

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

        public DeliveryCreateResponse build() {
            return new DeliveryCreateResponse(this);
        }
    }
}
