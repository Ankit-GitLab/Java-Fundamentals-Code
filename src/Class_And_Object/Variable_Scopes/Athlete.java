package Class_And_Object.Variable_Scopes;

// Class definition
public class Athlete {

    // Instance variables (belong to object, stored in heap)
    public String athleteName;
    public double athleteSpeed;
    public int athleteAge;

    // Constructor with local variables: name, speed, age
    public Athlete(String name, double speed, int age) {
        // Assigning local variables to instance variables using 'this'
        this.athleteName = name;
        this.athleteSpeed = speed;
        this.athleteAge = age;
    }

    // Method with local variable
    public void athleteRun() {
        int speed = 100; // Local variable (stored in stack, method-specific)
        System.out.println("Athlete runs at " + speed + " Km/hr");
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Creating object of Athlete
        Athlete a1 = new Athlete("Ankit", 25.5, 21);

        // Calling method
        a1.athleteRun();
    }
}

