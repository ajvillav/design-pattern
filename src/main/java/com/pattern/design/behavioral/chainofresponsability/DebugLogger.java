package com.pattern.design.behavioral.chainofresponsability;

public class DebugLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(message, level);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}