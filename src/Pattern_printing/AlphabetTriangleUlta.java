package Pattern_printing;
import java.util.Scanner;
public class AlphabetTriangleUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the alphabet triangle ulta : ");
        int x = sc.nextInt();
        for(int i=x; i>=1; i--){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
