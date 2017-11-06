package com.maurofokker.design.patterns.creational.factorymethod;

import com.maurofokker.design.patterns.creational.factorymethod.carfactory.BaseCarFactory;
import com.maurofokker.design.patterns.creational.factorymethod.carfactory.Car;
import com.maurofokker.design.patterns.creational.factorymethod.carfactory.CarFactory;
import org.junit.Test;

public class CarFactoryTest {

    @Test
    public void makeFamilyCar() {
        BaseCarFactory carFactory = new CarFactory();
        Car sportCar = carFactory.makeCar("sport");
    }
}
