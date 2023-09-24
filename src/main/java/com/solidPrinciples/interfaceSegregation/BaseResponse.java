package com.solidPrinciples.interfaceSegregation;

public class BaseResponse {

    String exceptionMessage;
    String statusCode;

    public BaseResponse() {
    }

    public BaseResponse(String exceptionMessage, String statusCode) {
        this.exceptionMessage = exceptionMessage;
        this.statusCode = statusCode;
    }

    private BaseResponse(Builder builder) {
        setExceptionMessage(builder.exceptionMessage);
        setStatusCode(builder.statusCode);
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
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

        public BaseResponse build() {
            return new BaseResponse(this);
        }
    }
}
