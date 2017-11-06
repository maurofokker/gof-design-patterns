package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * Product
 */
public abstract class Car {

    public abstract void getSpeed();

    public void startEngine() {
        System.out.println("Starting car engine...");
    }
}
