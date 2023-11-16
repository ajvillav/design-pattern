package com.pattern.design.creational.multiton.service;

import com.pattern.design.creational.multiton.util.SNSSender;

public class NotificationService {

    public void sendMessageToSpecificTopic(String topicArn) {
        SNSSender snsSender = SNSSender.getInstance(topicArn);
        snsSender.sendSNSMessage();
    }
}
