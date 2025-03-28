// 1. Count Vowels and Consonants in a String
// Problem: Write a Java program that counts the number of vowels and consonants in a given string.

import java.util.*;

public class prb1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0, consonents = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonents++;
                }
            }
            
        }
        System.out.println("Vowel Count: " + vowels);
        System.out.println("Consonents Count: " + consonents);
        sc.close();
    }
}
