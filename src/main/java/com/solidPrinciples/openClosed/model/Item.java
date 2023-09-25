package com.solidPrinciples.openClosed.model;

public class Item {

    private Money price;

    private Item(Builder builder) {
        setPrice(builder.price);
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }


    public static final class Builder {
        private Money price;

        public Builder() {
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
