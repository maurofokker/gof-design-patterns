package com.maurofokker.design.patterns.creational.abstractfactory.products;

import com.maurofokker.design.patterns.creational.abstractfactory.factories.BaseToppingFactory;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;

/**
 * ConcreteProduct
 *
 * factory method instantiates this class
 */
public class PepperoniPizza extends Pizza {
    BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }

}
