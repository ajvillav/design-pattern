package com.pattern.design.structural.decorator.nodecorator;

import com.pattern.design.structural.decorator.usingdecorator.Drug;

public class AlcoholWithCocaine extends Drug {

    @Override
    public String sensation() {
        return "Feeling of euphoria, relaxation, intense energy, and confidence";
    }

    @Override
    public double price() {
        // La inflación esta de locos
        return 30.0;
    }

}
