package com.solidPrinciples.openClosed.model;

public class Money {

    private double value;

    public static Money ZERO = new Builder().value(0.0).build();

    private Money(Builder builder) {
        setValue(builder.value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void addValue(Money money){
        this.setValue(this.getValue()+money.getValue());
    }


    public static final class Builder {
        private double value;

        public Builder() {
        }

        public Builder value(double val) {
            value = val;
            return this;
        }

        public Money build() {
            return new Money(this);
        }
    }
}
