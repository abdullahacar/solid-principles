package com.solidPrinciples.interfaceSegregation;

public interface ITraceableDeliveryDAO extends IDeliveryDAO{

    DeliveryGetStatusResponse getStatus(Delivery delivery);

}
