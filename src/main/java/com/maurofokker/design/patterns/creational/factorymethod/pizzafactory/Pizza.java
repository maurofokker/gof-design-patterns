package com.maurofokker.design.patterns.creational.factorymethod.pizzafactory;

/**
 * Product
 *
 * interface or abstract class
 */
public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes");
    }

}
