package Pattern_printing;
import java.util.Scanner;
public class AlphaNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print AlphaNumeric triangle : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
