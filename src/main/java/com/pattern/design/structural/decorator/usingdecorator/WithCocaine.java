package com.pattern.design.structural.decorator.usingdecorator;

public class WithCocaine extends DrugMixer{

    public WithCocaine(Drug baseDrug) {
        super(baseDrug);
    }

    @Override
    public String sensation() {
        return baseDrug.sensation() + ", intense energy and confidence";
    }

    @Override
    public double price() {
        return baseDrug.price() + 25.0;
    }
}
