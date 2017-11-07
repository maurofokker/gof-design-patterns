package com.maurofokker.design.patterns.creational.abstractfactory.factories;

import com.maurofokker.design.patterns.creational.abstractfactory.products.CaliforniaOilSauce;
import com.maurofokker.design.patterns.creational.abstractfactory.products.Cheese;
import com.maurofokker.design.patterns.creational.abstractfactory.products.GoatCheese;
import com.maurofokker.design.patterns.creational.abstractfactory.products.Sauce;

/**
 * Concrete Factory
 *
 * createCheese and createSouce are factory method
 * abstract factory object can use factory methods, one for each product to create
 */
public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
