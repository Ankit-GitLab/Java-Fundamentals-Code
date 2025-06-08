package in.AnkitCoding.challenge78;
import java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("246003",
        "Ankit kumar");

        System.out.print("Please enter how much money deposit: ");
        Double num1 = sc.nextDouble();
        account.depositMoney(num1);

        System.out.print("Please enter how much money withdraw: ");
        Double num2 = sc.nextDouble();
        account.depositMoney(num2);

        account.depositMoney(-40);

        account.withdrawMoney(0);



    }
}
