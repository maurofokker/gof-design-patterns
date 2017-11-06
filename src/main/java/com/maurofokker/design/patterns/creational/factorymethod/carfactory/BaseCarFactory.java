package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * Creator
 */
public abstract class BaseCarFactory {

    /**
     * Factory Method
     * @param type
     * @return
     */
    public abstract Car makeCar(String type);

}
