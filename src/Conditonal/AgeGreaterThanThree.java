package Conditonal;

import java.util.Scanner;

public class AgeGreaterThanThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Ram age : ");
        int RamAge = sc.nextInt();
        System.out.print("Enter the Shyam age : ");
        int ShyamAge = sc.nextInt();
        System.out.print("Enter the Ajay age : ");
        int AjayAge = sc.nextInt();
        if(RamAge>ShyamAge && RamAge>AjayAge){
            System.out.println("Ram Age is greater than Shyam Age and Ajay Age");
        }
        else if(ShyamAge>RamAge && ShyamAge>AjayAge){
            System.out.println("Shyam Age is greater than Ram Age and Ajay Age");
        }
        else{
            System.out.println("Ajay Age is greater than Shyam Age and Ram Age");
        }
        sc.close();
    }
}
