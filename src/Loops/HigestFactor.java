package Loops;
import java.util.Scanner;
public class HigestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Which you want to higest factor : ");
        int n = sc.nextInt();
        int hf = 1;
        for(int i=n/2; i>=1; i--){
            if(n%i==0) {
                hf = i;
                break; // break means ---> if break will be satisfy then stop the code and print
            }
        }
        System.out.print(hf); // 60 ---> higest factor is ---> 30
        sc.close();
    }
}
