package com.solidPrinciples.interfaceSegregation;

public class UntraceableDeliveryImpl implements IDeliveryDAO {

    @Override
    public DeliveryCreateResponse createDelivery(Delivery delivery) {
        return new DeliveryCreateResponse.Builder().build();
    }

    @Override
    public DeliveryUpdateResponse updateDelivery(Delivery delivery) {
        return new DeliveryUpdateResponse.Builder().build();
    }

}
