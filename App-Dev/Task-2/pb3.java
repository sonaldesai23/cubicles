// 3. Print Your Name
// Problem: Write a Java program that takes your name as input and prints it.

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Read input from keyboard.
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Corrected to read the full line
        System.out.println(name); // Print the name
        sc.close(); // Close the scanner
    }
}

