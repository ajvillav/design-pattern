package com.pattern.design.behavioral.chainofresponsability;

public interface Logger {
    void logMessage(String message, LogLevel level);
    void setNextLogger(Logger nextLogger);
}
