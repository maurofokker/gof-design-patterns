package com.maurofokker.design.patterns.creational.abstractfactory;

import com.maurofokker.design.patterns.creational.abstractfactory.factories.BasePizzaFactory;
import com.maurofokker.design.patterns.creational.abstractfactory.factories.GourmetPizzaFactory;
import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;
import org.junit.Test;

/**
 * Client
 */
public class GourmetPizzaFactoryTest {

    @Test
    public void createVeggieGourmetPizza() throws Exception {
        BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }

    @Test
    public void createCheeseGourmetPizza() throws Exception {
        BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
    }

}
