// Declaring a package named Class_And_Object
package Class_And_Object;

// Declaring a public class named Car
public class Car {

    // Declaring an integer variable to store the number of wheels
    int noOfWheel;

    // Declaring a string variable to store the color of the car
    String color;

    // Declaring a float variable to store the maximum speed of the car
    float maxSpeed;

    // Declaring a float variable to store the current fuel in liters
    float currentFuelInLiters;

    // Declaring an integer variable to store the number of seats
    int noOfSeats;

    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, can't start");
        }else if(currentFuelInLiters<5){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }else {
            System.out.println("Car is started.. bruhhh.....");
        }
        return this;
    }
    // Method to simulate driving the car
    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    // Method to add fuel to the car
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    // Method to get the current fuel level
    public float getCurrentFuelLevel() {
        // Returning the current fuel level
        return currentFuelInLiters;
    }
}
