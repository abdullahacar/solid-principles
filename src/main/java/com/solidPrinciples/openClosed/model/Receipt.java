package com.solidPrinciples.openClosed.model;


import java.util.List;

public class Receipt {

    private List<Item> items;
    private Payment payment;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
