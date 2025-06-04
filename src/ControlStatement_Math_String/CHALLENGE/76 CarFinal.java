package ControlStatement_Math_String.CHALLENGE;

class CarFinal {

    final int noOfWheel;
    final String model;
    final String engineInLiters;

    // Constructor to initialize final fields
    public CarFinal(int noOfWheel, String model, String engineInLiters) {
        this.noOfWheel = noOfWheel;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }

    // Method to display car details
    public void display() {
        System.out.println("Wheels: " + noOfWheel);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engineInLiters);
    }

    // Main method for testing
    public static void main(String[] args) {
        CarFinal car = new CarFinal(4, "Swift", "1.2L");
        car.display();
    }
}
