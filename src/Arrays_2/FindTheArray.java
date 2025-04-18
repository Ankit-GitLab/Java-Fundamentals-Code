package Arrays_2;
import java.util.Scanner;
public class FindTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,4,6,8,9,3,34,12,23,1};
        System.out.print("Enter the value which you want to find : ");
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.print("Index Number is : "+arr[i]+" present");
                break;
            }
            else {
                System.out.println("not present here");
                break;
            }
        }
    }
}
