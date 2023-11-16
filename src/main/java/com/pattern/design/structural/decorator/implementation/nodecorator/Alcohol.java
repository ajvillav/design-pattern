package com.pattern.design.structural.decorator.implementation.nodecorator;

import com.pattern.design.structural.decorator.implementation.decorator.Drug;

public class Alcohol extends Drug {

    @Override
    public String sensation() {
        return "Feeling of euphoria, relaxation";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
