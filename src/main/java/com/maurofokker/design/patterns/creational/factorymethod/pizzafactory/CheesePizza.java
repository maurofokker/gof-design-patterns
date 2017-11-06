package com.maurofokker.design.patterns.creational.factorymethod.pizzafactory;

/**
 * ConcreteProduct
 *
 * factory method instantiates this class
 */
public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza");
    }

}
