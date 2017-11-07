package com.maurofokker.design.patterns.creational.abstractfactory.factories;

import com.maurofokker.design.patterns.creational.factorymethod.pizzafactory.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);

}
