package com.maurofokker.design.patterns.creational.abstractfactory.products;

/**
 * Concrete Product
 */
public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese (){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozarrella cheese type...");
    }
}
