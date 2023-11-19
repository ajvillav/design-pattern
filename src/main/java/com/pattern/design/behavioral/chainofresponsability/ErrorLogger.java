package com.pattern.design.behavioral.chainofresponsability;

public class ErrorLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(message, level);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}