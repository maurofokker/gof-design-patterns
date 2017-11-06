package com.maurofokker.design.patterns.creational.factorymethod.pizzafactory;

/**
 * Creator
 *
 *  interface or abstract class that declares the factory method, which returns an object of type Product.
 */
public abstract class BasePizzaFactory {

    /**
     * Factory method
     * implementation of factory method in a concrete subclass
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);

}
