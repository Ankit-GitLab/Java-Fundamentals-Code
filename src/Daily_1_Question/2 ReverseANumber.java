package Daily_1_Question;
import java.util.Scanner;
class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome (🙏) to the program where reverse the number..");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0){
           reverse = reverse * 10;
           reverse = reverse + (num % 10);
           num = num / 10;
        }
        System.out.println("Your reverse number is: "+reverse);
        sc.close();
    }
}
