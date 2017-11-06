package com.maurofokker.design.patterns.creational.factorymethod.pizzafactory;

/**
 * ConcreteCreator
 *
 * implements factory method to create ConcreteProduct and return to Client
 */
public class PizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new IllegalArgumentException("Pizza not found");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
