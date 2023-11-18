package com.pattern.design.bijeibioral.ChainOfResponsability;

public interface Logger {
    void logMessage(String message, LogLevel level);
    void setNextLogger(Logger nextLogger);
}
