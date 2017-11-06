package com.maurofokker.design.patterns.creational.factorymethod;

import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.BasePizzaFactory;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.PizzaFactory;
import org.junit.Test;

/**
 * Client
 *
 * asks the Creator fot a Product
 */
public class PizzaFactoryTest {

    @Test
    public void makeCheesePizza() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
    }

    @Test
    public void makePepperoniPizza() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}
