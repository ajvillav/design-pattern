package com.pattern.design.behavioral.ChainOfResponsability;

class InfoLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(message, level);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
