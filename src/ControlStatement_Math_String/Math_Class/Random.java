package ControlStatement_Math_String.Math_Class;

public class Random {
    public static void main(String[] args) {
        int randomInt = (int)(Math.random() * 100) + 1; // range 1 to 100
        System.out.println("Random integer between 1 and 100: " + randomInt);
    }
}
