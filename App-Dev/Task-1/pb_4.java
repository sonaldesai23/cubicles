// 4. Find the Largest Number
// Problem: Write a Java program to find the largest number among three given numbers.

public class pb_4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 7;
        if(a > b && a > c){
            System.out.println("Largest number is: " + a);
        }
        else if(b > a && b > c){
            System.out.println("Largest number is: " + b);
        }
        else{
            System.out.println("Largest number is: " + c);
        }
    }
}
