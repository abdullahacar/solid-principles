package com.solidPrinciples.openClosed.model;

import com.solidPrinciples.openClosed.model.enums.PaymentMethod;

public class Payment {

    private PaymentMethod paymentMethod;
    private Money total;

    private Payment(Builder builder) {
        setPaymentMethod(builder.paymentMethod);
        setTotal(builder.total);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Money getTotal() {
        return total;
    }

    public void setTotal(Money total) {
        this.total = total;
    }

    public static final class Builder {
        private PaymentMethod paymentMethod;
        private Money total;

        public Builder() {
        }

        public Builder paymentMethod(PaymentMethod val) {
            paymentMethod = val;
            return this;
        }

        public Builder total(Money val) {
            total = val;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
