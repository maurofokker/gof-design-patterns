package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * ConcreteProduct
 */
public class FamilyCar extends Car {
    @Override
    public void getSpeed() {
        System.out.println("maximum speed 80 km/h");
    }
}
