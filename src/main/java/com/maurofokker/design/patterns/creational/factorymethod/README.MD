# Factory Method - Creational Design Pattern

* Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
* (It provides a way to delegate the instantiation logic to child classes.)
* Helps to encapsulate object creation code from client code
* Creation of the object is done in runtime
* Decoupled client code from concrete classes that are need to instantiate
* Centralize location for object creation code, more easy to debug

* Also known as `Virtual Constructor`

## Components of the factory method pattern

* `Product`: Is an interface or an abstract class whose subclasses are instantiated by the factory method.
* `ConcreteProduct`: Are the concrete subclasses that implement/extend Product. The factory method instantiates these subclasses.
* `Creator`: Is an interface or an abstract class that declares the factory method, which returns an object of type Product.
* `ConcreteCreator`: Is a concrete class that implements the factory method to create and return a ConcreteProduct to Client.
* `Client`: Asks the Creator for a Product.

A Client that requires a ConcreteProduct `does not create` any object but instead asks the Creator for it. The ConcreteCreator implements the factory method to create the object transparently from the Client. As a result the Client is not required to be aware of any ConcreteProduct and how they are created

## Applicability

Use the Factory Method pattern when

* A class can't anticipate the class of objects it must create
* A class wants its subclasses to specify the objects it creates
* Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate