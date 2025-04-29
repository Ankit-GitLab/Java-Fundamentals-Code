package Class_And_Object.Constructor;

class Parameterized {
    String model;

    // Parameterized constructor
    Parameterized(String m) {
        model = m;
    }

    public static void main(String[] args) {
        Parameterized myCar = new Parameterized("Honda");
        System.out.println("Model: " + myCar.model);
    }
}