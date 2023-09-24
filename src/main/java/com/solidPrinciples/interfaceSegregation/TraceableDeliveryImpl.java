package com.solidPrinciples.interfaceSegregation;

public class TraceableDeliveryImpl implements ITraceableDeliveryDAO {

    @Override
    public DeliveryCreateResponse createDelivery(Delivery delivery) {
        return new DeliveryCreateResponse.Builder().build();
    }

    @Override
    public DeliveryUpdateResponse updateDelivery(Delivery delivery) {
        return new DeliveryUpdateResponse.Builder().build();
    }

    @Override
    public DeliveryGetStatusResponse getStatus(Delivery delivery) {

        String referenceNumber = delivery.getReferenceNo();

        // make an API call with the reference number and return the response
        String status = "DELIVERED";

        return new DeliveryGetStatusResponse.Builder().status(status).build();
    }
}
