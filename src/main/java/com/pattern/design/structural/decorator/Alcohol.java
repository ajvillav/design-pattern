package com.pattern.design.structural.decorator;

import com.pattern.design.structural.decorator.usingdecorator.Drug;

public class Alcohol extends Drug {

    @Override
    public String getSensation() {
        return "Feeling of euphoria, relaxation";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
