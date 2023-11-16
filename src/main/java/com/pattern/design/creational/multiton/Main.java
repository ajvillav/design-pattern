package com.pattern.design.creational.multiton;

import com.pattern.design.creational.multiton.service.NotificationService;

public class Main {
    private static final NotificationService notificationService = new NotificationService();


    public static void main(String[] args) {
        int smsMessageNumber = 10;
        int emailMessageNumber = 5;

        sendMessageBatch(smsMessageNumber, "Specific SMS topic");
        sendMessageBatch(emailMessageNumber, "Specific Email topic");

    }

    private static void sendMessageBatch(int messageNumber, String topicArn) {
        int counter = 0;
        while (counter < messageNumber) {
            notificationService.sendMessageToSpecificTopic(topicArn);
            counter++;
        }
    }
}