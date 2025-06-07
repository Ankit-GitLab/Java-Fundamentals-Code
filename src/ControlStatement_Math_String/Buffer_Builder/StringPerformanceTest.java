package ControlStatement_Math_String.Buffer_Builder;

public class StringPerformanceTest {

    public static void main(String[] args) {
        // StringBuilder test
        StringBuilder sb = new StringBuilder();
        long startTime1 = System.nanoTime();  // Start time
        for (int i = 0; i < 100000; i++) {
            sb.append("a");  // Adding character to StringBuilder
        }
        long endTime1 = System.nanoTime();  // End time
        System.out.println("Time taken by StringBuilder: " + (endTime1 - startTime1) + " ns");

        // StringBuffer test
        StringBuffer sbf = new StringBuffer();
        long startTime2 = System.nanoTime();  // Start time
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");  // Adding character to StringBuffer
        }
        long endTime2 = System.nanoTime();  // End time
        System.out.println("Time taken by StringBuffer: " + (endTime2 - startTime2) + " ns");
    }
}
