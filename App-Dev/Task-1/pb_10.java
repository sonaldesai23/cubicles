// 10. Check if a Number is Palindrome
// Problem: Write a Java program to check whether a number is a palindrome.

public class pb_10 {
    public static void main(String[] args) {
        int n = 121; 
        int rev = 0; 
        int temp = n; 

        while(n > 0) {
            int num = n % 10; 
            rev = rev * 10 + num; 
            n = n / 10; 
        }
        if(temp == rev) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        } 
    } 
} 

