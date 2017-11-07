package com.maurofokker.design.patterns.creational.abstractfactory;

import com.maurofokker.design.patterns.creational.abstractfactory.factories.BasePizzaFactory;
import com.maurofokker.design.patterns.creational.abstractfactory.factories.SicilianPizzaFactory;
import org.junit.Test;

/**
 * Client
 */
public class SicilianPizzaFactoryTest {
    @Test
    public void createVeggieSicilianPizza() {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        pizzaFactory.createPizza("veggie");
    }

    @Test
    public void createPepperoniSicilianPizza() {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        pizzaFactory.createPizza("pepperoni");
    }
}
