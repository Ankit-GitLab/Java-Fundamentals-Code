package ControlStatement_Math_String.CHALLENGE;
import java.util.*;

class Circle {

 // Radius of the circle in millimeters
 double radiusInMM;

 // Constructor to initialize radius
 Circle(double radiusInMM) {
  this.radiusInMM = radiusInMM;
 }

 // Method to calculate circumference
 double getCircumference() {
  return 2 * Math.PI * radiusInMM;
 }

 // Method to calculate area
 double getArea() {
  return Math.PI * Math.pow(radiusInMM, 2);
 }

 // Overriding toString() to return formatted output
 @Override
 public String toString() {
  return "\nCircle Properties:" +
          "\nRadius in mm       : " + radiusInMM +
          "\nCircumference in mm: " + String.format("%.2f", getCircumference()) +
          "\nArea in mm²        : " + String.format("%.2f", getArea());
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("🙆 Welcome to the Circle Calculator 😎\n");
  System.out.print("Please enter the radius (mm): ");

  double radius = sc.nextDouble();

  Circle circle = new Circle(radius);
  System.out.println(circle);

  sc.close();
 }
}
