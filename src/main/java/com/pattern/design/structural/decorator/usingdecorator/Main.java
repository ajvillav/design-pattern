package com.pattern.design.structural.decorator.usingdecorator;

import com.pattern.design.structural.decorator.Alcohol;
import com.pattern.design.structural.decorator.nodecorator.AlcoholWithCocaine;
import com.pattern.design.structural.decorator.nodecorator.AlcoholWithTobacco;

public class Main {
    public static void main(String[] args) {

        // NO DECORATOR
        Drug softDrug = new AlcoholWithTobacco();

        System.out.println("\nEsto es alcohol con tabaco sin usar el patrón decorator:");
        System.out.println("\n" + softDrug.sensation());
        System.out.println(softDrug.price());

        Drug heavyDrug = new AlcoholWithCocaine();

        System.out.println("\nEsto es alcohol con cocaina sin usar el patrón decorator:");
        System.out.println("\n" + heavyDrug.sensation());
        System.out.println(heavyDrug.price());



        // DECORATOR
        Drug superHeavyDrug = new Alcohol();
        superHeavyDrug = new WithTobacco(superHeavyDrug);
        superHeavyDrug = new WithCocaine(superHeavyDrug);

        System.out.println("\nEsto es alcohol con tabaco y cocaina usando el patrón decorator:");
        System.out.println("\n" + superHeavyDrug.sensation());
        System.out.println("Total price: $" + superHeavyDrug.price() + "\n");
    }
}