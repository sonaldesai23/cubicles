// 2. Convert Decimal to Binary
// Problem: Write a Java program to convert a decimal number to binary.

import java.util.*;

public class prb2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a decimal number: ");
       int num = sc.nextInt();

       int quot = num % 2;

       for(num = num; num > 0; num = num / 2) {
           quot = num % 2;
           System.out.print(quot);
       }
       
       System.out.println(" Binary form of " + num + " is:" + quot);
       sc.close(); 
   } 
}
