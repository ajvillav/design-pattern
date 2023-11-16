package com.pattern.design.structural.decorator;

import com.pattern.design.structural.decorator.nodecorator.AlcoholWithCocaine;
import com.pattern.design.structural.decorator.nodecorator.AlcoholWithTobacco;
import com.pattern.design.structural.decorator.usingdecorator.Drug;
import com.pattern.design.structural.decorator.usingdecorator.WithCocaine;
import com.pattern.design.structural.decorator.usingdecorator.WithTobacco;

public class Main {
    public static void main(String[] args) {

        // NO DECORATOR
        Drug softDrug = new AlcoholWithTobacco();

        System.out.println("\nEsto es alcohol con tabaco sin usar el patrón decorator:");
        System.out.println("\n" + softDrug.getSensation());
        System.out.println(softDrug.getPrice());

        Drug heavyDrug = new AlcoholWithCocaine();

        System.out.println("\nEsto es alcohol con cocaina sin usar el patrón decorator:");
        System.out.println("\n" + heavyDrug.getSensation());
        System.out.println(heavyDrug.getPrice());



        // DECORATOR
        Drug superHeavyDrug = new Alcohol();
        superHeavyDrug = new WithTobacco(superHeavyDrug);
        superHeavyDrug = new WithCocaine(superHeavyDrug);

        System.out.println("\nEsto es alcohol con tabaco y cocaina usando el patrón decorator:");
        System.out.println("\n" + superHeavyDrug.getSensation());
        System.out.println("Total price: $" + superHeavyDrug.getPrice() + "\n");
    }
}