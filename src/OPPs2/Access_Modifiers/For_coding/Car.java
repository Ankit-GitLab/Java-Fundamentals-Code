package OPPs2.Access_Modifiers.For_coding;

/**
 * Car class showing different types of access modifiers:
 * - public: Accessible from anywhere
 * - private: Accessible only within the same class
 * - default (no modifier): Accessible only within the same package
 */
public class Car {

    // ✅ public: Isko kisi bhi class ya package se access kiya ja sakta hai
    public String color;
    public String model;

    // ✅ private: Sirf isi class ke andar access allowed hai (Encapsulation ke liye use hota hai)
    private double fuelLevel;

    // ✅ default (no modifier): Sirf same package ke classes se access possible hai
    long costOfPurchase;

    // ✅ public no-argument constructor
    public Car() {
    }

    // ✅ public constructor with parameters (used to initialize the object)
    public Car(String model, String color, double fuelLevel, long costOfPurchase) {
        this.model = model;
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    // ✅ toString() method object ka readable form print karta hai
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
