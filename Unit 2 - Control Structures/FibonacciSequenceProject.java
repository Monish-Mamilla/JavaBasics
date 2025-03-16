/**********************************
* Author: Monish Mamilla
* Program: Fibonacci Sequence
* Version 1.0
* Development Date: 11/25/24
***********************************/
package Unit2;
// Import scanner
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User will enter the number of elements
        System.out.print("Enter how many values of the Fibonacci sequence to print (minimum 5): ");
        int num = sc.nextInt();
        // Check if the input is valid
        if (num < 5) 
        {
            System.out.println("Invalid number.");
        } 
        else 
        {
            // Initialize the first two numbers of the Fibonacci sequence
            int first = 0, second = 1;
            // Print the Fibonacci sequence
            System.out.print("Fibonacci sequence: ");
            for (int i = 1; i <= num; i++) 
            {
                System.out.print(first + " ");
                int next = first + second; 
                first = second;           
                second = next;            
            }
            System.out.println(); 
        }

        // Close scanner
        sc.close();
    }
}

