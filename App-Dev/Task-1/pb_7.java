// 7. Reverse a Number
// Problem: Write a Java program to reverse a given number.

public class pb_7 {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;

        while(n!=0){
            int num = n % 10;
            rev = rev *10 + num;
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + rev);
    }
}
