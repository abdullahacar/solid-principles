package com.solidPrinciples.dependencyInversion;

public class SmsSender implements IMessageSender {
    @Override
    public void send() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("SMS has been sent !");
    }
}
