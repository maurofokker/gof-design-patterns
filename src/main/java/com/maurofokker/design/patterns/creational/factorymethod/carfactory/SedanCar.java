package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * ConcreteProduct
 */
public class SedanCar extends Car {
    @Override
    public void getSpeed() {
        System.out.println("maximum speed 100 km/h");
    }
}
