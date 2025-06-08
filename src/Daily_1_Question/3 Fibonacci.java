package Daily_1_Question;
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome (🙏) to print Fibonacci Series..");
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("The first " + num + " terms of the Fibonacci sequence: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
