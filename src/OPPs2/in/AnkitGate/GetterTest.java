package OPPs2.in.AnkitGate;  // Package declaration for GetterTest class

import OPPs2.GetterAndSetter.Car;  // Importing the Car class from another package

public class GetterTest {
    public static void main(String[] args) {

        // Creating an object of Car using the constructor with parameters
        Car car = new Car("Red", "Maurti", 3, 80000);

        // Printing the color and model of the car using getter methods
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}
