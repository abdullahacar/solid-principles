package com.solidPrinciples.interfaceSegregation;

import java.util.ArrayList;
import java.util.List;

public class InterfaceSegregationTester {

    public static void test() {

        Delivery traceableDelivery = new TraceableDelivery.Builder().referenceNo("1").status("UNDEFINED").build();

        TraceableDeliveryImpl traceableDeliveryDAO = new TraceableDeliveryImpl();

        DeliveryCreateResponse createResponseTraceable = traceableDeliveryDAO.createDelivery(traceableDelivery);
        DeliveryUpdateResponse updateResponseTraceable = traceableDeliveryDAO.updateDelivery(traceableDelivery);
        DeliveryGetStatusResponse getStatusResponse = traceableDeliveryDAO.getStatus(traceableDelivery);

        Delivery untraceableDelivery = new UntraceableDelivery.Builder().referenceNo("2").build();

        UntraceableDeliveryImpl untraceableDeliveryDAO = new UntraceableDeliveryImpl();

        DeliveryCreateResponse createResponseUntraceable = untraceableDeliveryDAO.createDelivery(untraceableDelivery);
        DeliveryUpdateResponse updateResponseUnTraceable = untraceableDeliveryDAO.updateDelivery(untraceableDelivery);

        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList.add(traceableDelivery);
        deliveryList.add(untraceableDelivery);

        for (Delivery delivery : deliveryList) {
            System.out.println(delivery.getReferenceNo());
        }

    }


}
