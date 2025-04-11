package Arrays;

public class Predict1 {
    public static void main(String[] args) {
        int[] marks = {10,95,85,21,17,7,36,35};
        int n = marks.length;
        for(int i=0; i<n; i++){
            if(marks[i]>=35){
                System.out.println("Pass index "+i+" --> "+marks[i]);
            }
            else{
                System.out.println("fail index "+i+" --> "+marks[i]);

            }
        }

    }
}
