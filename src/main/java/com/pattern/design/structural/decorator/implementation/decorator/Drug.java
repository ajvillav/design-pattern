package com.pattern.design.structural.decorator.implementation.decorator;

//Clase padre Droga de la cual heredaran las demás
public abstract class Drug {

    public String sensation() {
        return "No sensation";
    }

    public double price() {
        return 0.0;
    }
}
