package com.pattern.design.behavioral.ChainOfResponsability;

public class Main {

    public static void main(String[] args) {

        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        // Ejemplo de log
        infoLogger.logMessage("This is an information.", LogLevel.INFO);
        infoLogger.logMessage("This is a debug message.", LogLevel.DEBUG);
        infoLogger.logMessage("This is an error message.", LogLevel.ERROR);

    }
}
