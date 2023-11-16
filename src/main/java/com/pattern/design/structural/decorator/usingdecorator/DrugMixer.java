package com.pattern.design.structural.decorator.usingdecorator;

// Este es el decorador, la clase fundamental para poder implementar el patrón
public abstract class DrugMixer extends Drug {

    protected Drug baseDrug;

    //Constructor que recibe un objeto del tipo más abstracto (padre)
    public DrugMixer(Drug baseDrug) {
        this.baseDrug = baseDrug;
    }

    @Override
    public String sensation() {
        return baseDrug.sensation();
    }

    @Override
    public double price() {
        return baseDrug.price();
    }

}
