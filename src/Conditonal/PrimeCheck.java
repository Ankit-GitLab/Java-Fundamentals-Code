package Conditonal;

public class PrimeCheck{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        int isPrime;

        for (int num = 2; num <= 100; num++) {
            isPrime = 1;

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                System.out.print(num+" ");
            }
        }
    }
}