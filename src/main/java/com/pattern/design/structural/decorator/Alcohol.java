package com.pattern.design.structural.decorator;

import com.pattern.design.structural.decorator.usingdecorator.Drug;

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
