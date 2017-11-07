# Abstract Factory - Creational Design Pattern

* Used to create families of objects
* Objects of a family are designed to work together
* The pattern provide an interface for creating families of related or dependent objects without specifying their concrete classes
* A factory of factories; a factory that groups the individual but related/dependent factories together without specifying their concrete classes.
* Can use factory method or prototype patterns to create objects

## Differences with Factory Method pattern

* Abstract factory adds another level of abstraction to factory method
* Abstract factory abstracts the way factories are created, while factory method abstracts objects creation
* Abstract factory uses composition while factory method uses inheritance
* Abstract factory is an object to create families of objects, while factory method is just a method to create an object of a single type
* Abstract factory object can use factory methods, one for each product to create

## Components of the factory method pattern

* `AbstractProduct`: Is an interface or an abstract class whose subclasses are instantiated by the abstract factory objects
* `ConcreteProduct`: Are the concrete subclasses that implement/extend AbstractProduct. The abstract factory objects instantiate these subclasses
* `AbstractFactory`: Is an interface or an abstract class whose subclasses instantiate a family of AbstractProduct objects
* `ConcreteFactory`: Are the concrete subclasses that implement/extend AbstractFactory. An object of this subclass instantiates a family of AbstractProduct objects
* `Client`: Uses AbstractFactory to get AbstractProduct objects

## Applicability

Use the Abstract Factory pattern when

* A system should be independent of how its products are created, composed and represented
* A system should be configured with one of multiple families of products
* A family of related product objects is designed to be used together, and you need to enforce this constraint
* You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
* The lifetime of the dependency is conceptually shorter than the lifetime of the consumer.
* You need a run-time value to construct a particular dependency
* You want to decide which product to call from a family at runtime.
* You need to supply one or more parameters only known at run-time before you can resolve a dependency.