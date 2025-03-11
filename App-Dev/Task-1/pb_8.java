// 8. Check for Prime Number
// Problem: Write a Java program to check whether a number is prime or not.

public class pb_8{
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
