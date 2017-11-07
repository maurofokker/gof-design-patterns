package com.maurofokker.design.patterns.creational.abstractfactory.factories;

import com.maurofokker.design.patterns.creational.abstractfactory.products.Cheese;
import com.maurofokker.design.patterns.creational.abstractfactory.products.Sauce;

/**
 * Abstract Factory
 *
 * abstracts methods to create Cheese and Sauce Products
 * providing an “interface to create families of related or dependent objects“ --> Cheese and Sauce
 * but you do not specify the concrete classes of the objects to create --> not concerned on ConcreteProducts (GoatCheese, MozzarellaCheese, TomatoSauce, or CaliforniaOilSauce)
 */
public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();

    public abstract Sauce createSauce();

}
