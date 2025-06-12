package Class_And_Object.Instance;

public class Variables {

    // Instance variables
    String model;  // Instance variable for model
    int year;      // Instance variable for year

    // Constructor to initialize instance variables
    Variables (String model, int year) {
        this.model = model;  // 'this.model' refers to the instance variable
        this.year = year;    // 'this.year' refers to the instance variable
    }

    // Method to display car details
    public void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects of the Car class
        Variables  car1 = new Variables ("Toyota", 2020);
        Variables  car2 = new Variables ("Honda", 2022);

        // Calling display method to print car details
        car1.display();  // Output: Car Model: Toyota, Year: 2020
        car2.display();  // Output: Car Model: Honda, Year: 2022
    }
}

