package com.pattern.design.behavioral.ChainOfResponsability;

public interface Logger {
    void logMessage(String message, LogLevel level);
    void setNextLogger(Logger nextLogger);
}
