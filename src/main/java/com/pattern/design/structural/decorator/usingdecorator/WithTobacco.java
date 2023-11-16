package com.pattern.design.structural.decorator.usingdecorator;

public class WithTobacco extends DrugMixer {

    public WithTobacco(Drug baseDrug) {
        super(baseDrug);
    }

    /**
     * No importa lo que viene desde antes, estamos agregando algo nuevo sin necesidad de repetir
     * el codigo anterior
     */
    @Override
    public String getSensation() {
        return baseDrug.getSensation() + ", slight dizziness";
    }

    @Override
    public double getPrice() {
        return baseDrug.getPrice() + 2.0;
    }

}
