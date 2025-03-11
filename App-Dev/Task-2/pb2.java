// 2. Print a Pyramid Pattern
// Problem: Write a Java program to print the following pyramid pattern for a given number of rows.
public class pb2 {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}



/*

       * 
      *** 
     ***** 
    ******* 
   ********* 
 */