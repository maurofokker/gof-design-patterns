package com.maurofokker.design.patterns.creational.abstractfactory.products;

/**
 * Concrete Product
 */
public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce type...");
    }
}
