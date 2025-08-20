package OPPs2.Access_Modifiers.For_coding;

public class AccessCar {
    public static void main(String[] args) {

        // ✅ Default constructor se object create kiya
        Car car = new Car();

        // ✅ public fields ko directly access kiya
        car.color = "Red";
        car.model = "Swift";

        // ❌ fuelLevel ko yahan direct access nahi kar sakte kyunki woh private hai
        // car.fuelLevel = 30; // ❌ Error hoga agar try karoge

        // Object print karne par toString() method call hoga
        System.out.println(car);

        // ✅ Parameterized constructor se object banaya
        Car newCar = new Car("Black", "BMW", 1, 50000000);

        // toString() method object ka data dikhayega
        System.out.println(newCar);
    }
}
