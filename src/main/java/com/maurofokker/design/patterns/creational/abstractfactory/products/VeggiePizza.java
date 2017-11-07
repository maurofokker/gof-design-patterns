package com.maurofokker.design.patterns.creational.abstractfactory.products;

import com.maurofokker.design.patterns.creational.abstractfactory.factories.BaseToppingFactory;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;

/**
 * ConcreteProduct
 *
 * factory method instantiates this class
 */
public class VeggiePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }

}
