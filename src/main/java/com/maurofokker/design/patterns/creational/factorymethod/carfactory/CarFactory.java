package com.maurofokker.design.patterns.creational.factorymethod.carfactory;

/**
 * ConcreteCreator
 */
public class CarFactory extends BaseCarFactory {
    @Override
    public Car makeCar(String type) {
        Car car;
        switch (type.toLowerCase()) {
            case "family":
                car = new FamilyCar();
                break;
            case "sport":
                car = new SportCar();
                break;
            case "sedan":
                car = new SedanCar();
                break;
            default:
                throw new IllegalArgumentException("Car not found");
        }
        car.getSpeed();
        car.startEngine();
        return car;
    }
}
