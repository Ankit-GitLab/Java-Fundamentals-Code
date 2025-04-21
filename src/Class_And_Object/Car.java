// Declaring a package named Class_And_Object
package Class_And_Object;

// Declaring a public class named Car
public class Car {

    // Static variable to keep count of total cars sold
    static int noOfCarSold;

    // Instance variables for car properties
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // Static block runs once when the class is first loaded
    static {
        noOfCarSold = 0; // Initializing number of cars sold to 0
        System.out.println("I am in Static Block"); // Output when class is loaded
    }

    // Instance initialization block runs every time a new object is created
    {
        noOfCarSold++; // Increment car count
        System.out.println("I am in Init Block"); // Output during object creation
    }

    // Constructor with color parameter
    Car(String color) {
        noOfWheels = 4; // Setting default number of wheels
        this.color = color; // Assigning the provided color
        maxSpeed = 150; // Setting max speed
        currentFuelInLiters = 2; // Default fuel amount
        noOfSeats = 5; // Default number of seats
    }

    // Default constructor with predefined color and fuel amount
    Car() {
        this("Black"); // Calls the parameterized constructor
        currentFuelInLiters = 5; // Overrides fuel amount
    }

    // Method to start the car
    public Car start() {
        if (currentFuelInLiters == 0) {
            // If there's no fuel
            System.out.println("Car is out of fuel, can't start");
        } else if (currentFuelInLiters < 5) {
            // If fuel is in reserve
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters--; // Decreasing fuel
        } else {
            // If fuel is sufficient
            System.out.println("Car is started.. bruhhh.....");
        }
        System.out.println(); // Empty line for spacing
        return this; // Returning the current object (for method chaining if needed)
    }

    // Method to simulate driving the car
    public void drive() {
        if (currentFuelInLiters > 0) {
            currentFuelInLiters--; // Reduce fuel by 1
            System.out.println("Car is driving"); // Print message
        } else {
            System.out.println("Cannot drive, out of fuel"); // Safety message
        }
    }

    // Method to add fuel to the car
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters; // Increase fuel
    }

    // Method to get the current fuel level
    public float getCurrentFuelLevel() {
        return currentFuelInLiters; // Returning current fuel level
    }
}
