package com.maurofokker.design.patterns.creational.abstractfactory.products;

/**
 * Concrete Product
 */
public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese type...");
    }
}
