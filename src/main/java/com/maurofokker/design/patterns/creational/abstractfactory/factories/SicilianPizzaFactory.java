package com.maurofokker.design.patterns.creational.abstractfactory.factories;

import com.maurofokker.design.patterns.creational.abstractfactory.products.CheesePizza;
import com.maurofokker.design.patterns.creational.abstractfactory.products.PepperoniPizza;
import com.maurofokker.design.patterns.creational.abstractfactory.products.VeggiePizza;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;

public class SicilianPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory= new SicilianToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("Pizza not found");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
