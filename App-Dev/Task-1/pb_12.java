// 12. Find Sum of Digits
// Problem: Write a Java program to find the sum of digits of a given number.

public class pb_12 {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
