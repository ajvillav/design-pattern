package com.pattern.design.multiton.service;

import com.pattern.design.multiton.util.SNSSender;

public class NotificationService {

    public void sendMessageToSpecificTopic(String topicArn) {
        SNSSender snsSender = SNSSender.getInstance(topicArn);
        snsSender.sendSNSMessage();
    }
}
