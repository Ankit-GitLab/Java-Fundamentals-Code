package Conditonal;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profit = 0,loss = 0;
        System.out.print("Enter cost price : ");
        int costPrice = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sellingPrice = sc.nextInt();
        if(costPrice < sellingPrice) {
            profit = sellingPrice - costPrice;
            System.out.println(profit+" rupees is profit");

        }
        else if(costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            System.out.println(loss+" rupees is loss");
        }
        else{
            System.out.println("no Profit, no Loss");
        }
        sc.close();
    }
}
