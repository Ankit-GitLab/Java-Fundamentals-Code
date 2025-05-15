package in.AnkitCoding.utils;

import in.AnkitCoding.geomerty.Circle;
import in.AnkitCoding.geomerty.Rectangle;

import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double recArea = rect.breadth * rect.length;

        System.out.println("🙆 Area of circle is: "+cirArea);
        System.out.println("🙆 Area of rectangle is: "+recArea);

    }
}
