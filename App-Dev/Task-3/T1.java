// 1. Simple Calculator Using Switch Case
// Problem: Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding operation using a switch case.

import java.util.*;
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        Float n1 = sc.nextFloat();
        Float n2 = sc.nextFloat();
        System.out.println("Enter the operator to perform the task:");
        String opr = sc.next();

        switch (opr) {
            case "+": 
                      System.out.println("Addition: " + (n1 + n2));
                      break;
            case "-": 
                      System.out.println("Subtraction: " + (n1 - n2));
                      break;
            case "*":
                      System.out.println("Multiplication: " + (n1 * n2));
                      break;
            case "/":
                      System.out.println("Division: " + (n1 / n2));
                      break;
            default:
                throw new AssertionError();
        }
    }
}
