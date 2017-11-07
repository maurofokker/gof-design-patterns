package com.maurofokker.design.patterns.creational.abstractfactory.factories;

import com.maurofokker.design.patterns.creational.abstractfactory.products.Cheese;
import com.maurofokker.design.patterns.creational.abstractfactory.products.MozzarellaCheese;
import com.maurofokker.design.patterns.creational.abstractfactory.products.Sauce;
import com.maurofokker.design.patterns.creational.abstractfactory.products.TomatoSauce;

/**
 * Concrete Factory
 */
public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
