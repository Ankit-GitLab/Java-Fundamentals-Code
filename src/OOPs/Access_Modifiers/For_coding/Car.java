package OOPs.Access_Modifiers.For_coding;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car(){

    }

    public Car(String model, String color, double fuelLevel, long costOfPurchase) {
        this.model = model;
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
