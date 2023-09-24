package com.solidPrinciples.dependencyInversion;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void test() {

        List<IMessageSender> messageSenderList = new ArrayList<>();

        messageSenderList.add(new EmailSender());
        messageSenderList.add(new SmsSender());

        for (IMessageSender iMessageSender : messageSenderList) {
            iMessageSender.send();
        }


    }

}
