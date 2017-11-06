package com.maurofokker.design.patterns.creational.factorymethod.pizzafactory;

/**
 * ConcreteProduct
 *
 * factory method instantiates this class
 */
public class VeggiePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza");
    }

}
