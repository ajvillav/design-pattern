package com.pattern.design.structural.decorator.usingdecorator;

//Clase padre Droga de la cual heredaran las demás
public abstract class Drug {

    public String getSensation() {
        return "No sensation";
    }

    public double getPrice() {
        return 0.0;
    }
}
