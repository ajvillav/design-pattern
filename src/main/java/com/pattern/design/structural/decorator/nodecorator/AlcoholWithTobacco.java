package com.pattern.design.structural.decorator.nodecorator;

import com.pattern.design.structural.decorator.usingdecorator.Drug;

public class AlcoholWithTobacco extends Drug {

    @Override
    public String sensation() {
        return "Feeling of euphoria, relaxation, and slight dizziness";
    }

    @Override
    public double price() {
        return 7.0;
    }

}
