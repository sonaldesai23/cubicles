// 2. Convert Decimal to Binary
// Problem: Write a Java program to convert a decimal number to binary.

import java.util.*;

public class prb2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            int num = sc.nextInt();
            int original = num;
            
            String binary = "";
            
            while (num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num = num / 2;
            }
            
            System.out.println("Binary form of " + original + " is: " + binary);
        }
    }
}
