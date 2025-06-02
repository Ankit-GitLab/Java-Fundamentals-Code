package Class_And_Object.Code_Blocks;

public class Static {
    static int number;

    // Static block
    static {
        number = 100;
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println("Number = " + number);
    }

}
