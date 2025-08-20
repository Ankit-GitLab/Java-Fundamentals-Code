package OPPs2.GetterAndSetter;

// Class representing a Car with some basic properties
public class Car {
    // Private fields for encapsulation
    private String color;           // Color of the car
    private String model;           // Model name of the car
    private double fuelLevel;       // Current fuel level in the car
    private long costOfPurchase;    // Purchase cost of the car

    // Constructor to initialize all the fields
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;                     // Assign color to the car
        this.model = model;                     // Assign model name to the car
        this.fuelLevel = fuelLevel;             // Set initial fuel level
        this.costOfPurchase = costOfPurchase;   // Set the cost of purchase
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Getter method to return the color of the car
    public String getColor(){
        return color;
    }

    void setColor(String color){
        if(color.equals("Yellow")){
            System.out.println("Pagal hai kya");
        }else {
            this.color = color;
         }
    }

    // Getter method to return the model of the car
    public String getModel(){
        return model;
    }
}
