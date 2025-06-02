package Daily_1_Question;

class ArmstrongNumberPrint1To1000 {
    public static void main(String[] args) {
        System.out.println("Welcome (🙏) to the code of Armstrong number checker between 1 to 1000\n");
        System.out.print("Armstrong numbers between 1 and 10000 are: ");

        // Loop through numbers from 1 to 10000
        for (int num = 1; num <= 10000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        // Loop to extract each digit and raise it to the power of 'digits'
        while (num != 0) {
            int digit = num % 10;
            sum += (int)Math.pow(digit, digits);
            num /= 10; // Remove last digit
        }

        return sum == originalNumber;
    }
}
