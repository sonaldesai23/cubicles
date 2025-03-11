// 1. Print a Right-Angled Triangle Pattern
// Problem: Write a Java program to print the following right-angled triangle pattern for a given number of rows.

public class pb1 {
    public static void main(String[] args){
        int r = 5;
        for(int i = 0; i < r; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("\n");
    }
}


/*

* 
* * 
* * * 
* * * * 
* * * * * 

 */