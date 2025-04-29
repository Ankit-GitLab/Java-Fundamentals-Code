package Class_And_Object.Constructor;

class CarParameter {
    String model;

    // Parameterized constructor
    CarParameter(String m) {
        model = m;
    }

    public static void main(String[] args) {
        CarParameter myCar = new CarParameter("Honda");
        System.out.println("Model: " + myCar.model);
    }
}