package Daily_1_Question;

class ArmstrongNumberChecker {

    public static void main(String[] args) {
        System.out.println("Welcome (🙏) to check the Armstrong number\n");

        int number = 153;

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;

        // Find number of digits
        int digits = String.valueOf(num).length();

        int sum = 0;

        // Loop to extract digits and compute the power
        while (num != 0) {
            int digit = num % 10; // Get last digit
            sum += (int)Math.pow(digit, digits);
            num /= 10; // Remove last digit
        }

        return sum == originalNumber;
    }
}
