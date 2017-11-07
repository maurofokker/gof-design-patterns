package com.maurofokker.design.patterns.creational.abstractfactory.products;

/**
 * Concrete Product
 */
public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce type...");
    }
}
