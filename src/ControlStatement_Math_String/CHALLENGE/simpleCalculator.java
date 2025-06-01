package ControlStatement_Math_String.CHALLENGE;
import java.util.*;
public class simpleCalculator {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Simple Calculator");

            System.out.print("Enter first number : ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number : ");
            double num2 = sc.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.print(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.print(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.print(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.print(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.print("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.print("Error: Invalid operator Used . Please use +, -, *, or /. this type operator");
            }

            sc.close();
        }
    }

