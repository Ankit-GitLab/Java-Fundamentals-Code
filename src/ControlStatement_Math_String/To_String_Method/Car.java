package ControlStatement_Math_String.To_String_Method;

public class Car {
    // Fields representing properties of the car
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber; // corrected from modalNumber
    String company;

    // Constructor to initialize the car object
    public Car(int noOfWheels, int noOfDoors, int maxSpeed,
               String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // Overriding the toString() method to provide a clean output
    @Override
    public String toString() {
        return "Car Details:\n" +
                "Name: " + name + "\n" +
                "Model Number: " + modelNumber + "\n" +
                "Company: " + company + "\n" +
                "Number of Wheels: " + noOfWheels + "\n" +
                "Number of Doors: " + noOfDoors + "\n" +
                "Max Speed: " + maxSpeed + " km/h";
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW896", "Maruti");
        System.out.println(swift);
    }
}
