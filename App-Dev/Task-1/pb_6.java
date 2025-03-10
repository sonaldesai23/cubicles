// 6. Calculate Factorial
// Problem: Write a Java program to find the factorial of a number.

public class pb_6 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
    
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
    
