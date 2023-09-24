package com.solidPrinciples.interfaceSegregation;

public interface IDeliveryDAO {

    DeliveryCreateResponse createDelivery(Delivery delivery);

    DeliveryUpdateResponse updateDelivery(Delivery delivery);

}
