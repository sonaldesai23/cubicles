// 14. Print Fibonacci Series
// Problem: Write a Java program to print the Fibonacci series up to n terms.

public class pb_14 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }

    }
}
