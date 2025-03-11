// 11. Count Digits in a Number
// Problem: Write a Java program to count the number of digits in a given number.

public class pb_11 {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
