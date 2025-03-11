// 13. Swap Two Numbers Without Using a Third Variable
// Problem: Write a Java program to swap two numbers without using a third variable.

public class pb_13 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
