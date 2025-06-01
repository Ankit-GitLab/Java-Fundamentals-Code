package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,7,11,13,17,23,29};
        System.out.print("Enter a number which you want to search in index : ");
        int x = sc.nextInt();
        boolean flag = false;
        int i;
        for(i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
            if(flag==false) {
                System.out.println("Not present in this arrays");
            }
            else
             System.out.println("In "+i+" index "+x+" is present");


        sc.close();
    }
}

