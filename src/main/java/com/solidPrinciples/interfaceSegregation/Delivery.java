package com.solidPrinciples.interfaceSegregation;

public class Delivery {

    private String referenceNo;

    public Delivery(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
