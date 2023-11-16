package com.pattern.design.creational.multiton.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Data
@Slf4j
public class SNSSender {

    private static final Map<String, SNSSender> instances = new HashMap<>();
    private String topicArn;

    private SNSSender(String topicArn) {
        log.info("\rNew SNSSender Instance Created...");
        this.topicArn = topicArn;
    }

    public static  SNSSender getInstance(String topicArn) {
        return instances.computeIfAbsent(topicArn, SNSSender::new);
    }

    public void sendSNSMessage() {
        log.info("Message sent to following SNS topic: " + topicArn);
    }

}
