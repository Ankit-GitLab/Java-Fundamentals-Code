package ControlStatement_Math_String.Loop;

public class CountDigit {

    public static void main(String[] args) {
        int number = 987654;
        int count = 0;

        // While loop to count digits
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++; // Increase count
        }

        System.out.println("Total Digits: " + count);
    }
}

