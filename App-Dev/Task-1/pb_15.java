// 15. Find the Power of a Number
// Problem: Write a Java program to calculate the power of a number using a loop.

public class pb_15 {
    public static void main(String[] args) {
        int n = 2;
        int p = 3;
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        System.out.println("The power of " + n + "^" + p + " is " + result);
    }
}
