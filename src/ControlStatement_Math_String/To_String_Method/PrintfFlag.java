package ControlStatement_Math_String.To_String_Method;

public class PrintfFlag {

    public static void main(String[] args) {
        int num = 1234;
        int neg = -1234;
        float pi = 3.14159f;

        // '-' : Left align
        System.out.printf("Left aligned      : %-10d <--\n", num);

        // '+' : Include + for positive numbers
        System.out.printf("Show sign (+)     : %+d\n", num);
        System.out.printf("Show sign (+/-)   : %+d\n", neg);

        // '(' : Enclose negative numbers in parentheses
        System.out.printf("Parentheses neg   : %(d\n", neg);

        // '0' : Zero padded
        System.out.printf("Zero padded       : %010d\n", num);

        // ',' : Grouping separator
        System.out.printf("With commas       : %,d\n", 1000000);

        // ' ' (space): Add leading space if positive
        System.out.printf("Space before +ve  : % d\n", num);
        System.out.printf("Space before -ve  : % d\n", neg);

        // Combine multiple flags
        System.out.printf("Combined flags    : %+(,10d\n", neg);
    }
}

