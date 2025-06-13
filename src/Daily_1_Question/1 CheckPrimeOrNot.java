package Daily_1_Question;
import java.util.Scanner;

class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome (🙆) to check the program of Prime or not");

        // Taking input from user
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        // Handling edge cases
        if(num <= 1){
            System.out.println(num + " is neither prime nor composite");
        }
        else {
            boolean check = false;

            // Loop from 2 to num-1 to check divisibility
            for(int i = 2; i <=Math.sqrt(num); i++) {
                if(num % i == 0){
                    check = true;  // Not a prime
                    break;
                }
            }

            // Result
            if(!check){
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

        sc.close();  // Close scanner
    }
}
