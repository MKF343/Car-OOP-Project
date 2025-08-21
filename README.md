Description

This Java project demonstrates the principles of object-oriented programming (OOP), including inheritance and polymorphism, through a simulation of different car types. The project features a general Car class with specialized subclasses for GasCar, ElectricCar, and HybridCar, each with its own unique engine type and characteristics.

How It Works

The Assignment4.java file creates an array of Car objects, including instances of GasCar, ElectricCar, and HybridCar. It then iterates through this array, demonstrating polymorphism by calling the toString() method on each object to display its specific details.

The output will show the make, model, and engine type for each car, highlighting the differences between the gas, electric, and hybrid models.

Class Overview

    Assignment4.java: The main class that runs the program. It creates instances of the different car types and prints their information to the console.

    Car.java: A general class that represents a car with a make and a model.

    GasCar.java: A subclass of Car that represents a gasoline-powered car. It has a GasEngine object.

    ElectricCar.java: A subclass of Car that represents an electric car. It has an ElectricEngine object.

    HybridCar.java: A subclass of Car that represents a hybrid car. It has both a GasEngine and an ElectricEngine.

    GasEngine.java: A simple class that represents a gas engine with a specific horsepower.

    ElectricEngine.java: A simple class that represents an electric engine with a specific voltage.
