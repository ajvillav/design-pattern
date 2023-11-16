package com.pattern.design.structural.decorator.usingdecorator;

public class WithCocaine extends DrugMixer{

    public WithCocaine(Drug baseDrug) {
        super(baseDrug);
    }

    @Override
    public String getSensation() {
        return baseDrug.getSensation() + ", intense energy and confidence";
    }

    @Override
    public double getPrice() {
        return baseDrug.getPrice() + 25.0;
    }
}
