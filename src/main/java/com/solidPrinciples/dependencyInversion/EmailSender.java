package com.solidPrinciples.dependencyInversion;

public class EmailSender implements IMessageSender {

    @Override
    public void send() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("E-mail has been sent !");
    }

}
