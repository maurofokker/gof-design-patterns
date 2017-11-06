package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * ConcreteProduct
 */
public class SportCar extends Car {
    @Override
    public void getSpeed() {
        System.out.println("maximum speed 230 km/h");
    }
}
