package com.pattern.design.structural.decorator.nodecorator;

import com.pattern.design.structural.decorator.usingdecorator.Drug;

public class AlcoholWithTobacco extends Drug {

    @Override
    public String getSensation() {
        return "Feeling of euphoria, relaxation, and slight dizziness";
    }

    @Override
    public double getPrice() {
        return 7.0;
    }

}
