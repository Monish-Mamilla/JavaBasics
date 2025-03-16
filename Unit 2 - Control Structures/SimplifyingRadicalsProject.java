/**********************************
* Author: Monish Mamilla
* Program: Simplifying a Radical
* Version 1.0
* Development Date: 12/5/24
***********************************/
package Unit2;
// Importing scanner
import java.util.Scanner;
public class SimplifyingRadicals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User will enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num > 0) 
        {
            // Initialize largest perfect square and declare it. 
            int largestPerfSq = 1; 
            int i = (int) Math.sqrt(num); 
            while (i <= num) 
            {
                if (num % (i * i) == 0) 
                { 
                    largestPerfSq = i * i; 
                    break; 
                }
                i--;
            }
            // Answer that is outside the square root
            int outsideSqrt = (int) Math.sqrt(largestPerfSq); 
            // Answer that is inside the square root
            int remaining = num / largestPerfSq; 
            
            for (int value = 1; value <= 1; value++) 
            { 
                if (remaining == 1) 
                {
                    System.out.println("√" + num + " = " + outsideSqrt);
                } 
                else 
                {
                    System.out.println("√" + num + " = " + outsideSqrt + "√" + remaining);
                }
            }
        } 
        else 
        {
            // If user enters an invalid number, then the message below will print
            System.out.println("Invalid number.");
        }
        // Close scanner
        sc.close();
    }
}